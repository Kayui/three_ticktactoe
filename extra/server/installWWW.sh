#!/bin/bash

if ! which httpd &> /dev/null; then
   echo Please install Apache!
   exit 1
fi


TICTACDIR=/var/TicTacToe


#Server conf directory
CONFDIR=$(httpd -V 2> /dev/null | grep -i HTTPD_ROOT | cut -f2 -d'"') 
#Server config file
CONFFILE=$(httpd -V 2> /dev/null | grep -i SERVER_CONFIG_FILE | cut -f2 -d'"')
WWW_ROOT=$(cat $CONFDIR/$CONFFILE | grep -i '^DocumentRoot' | cut -f2 -d'"')

TEMP_PASS=$(date +%s | sha256sum | base64 | head -c 32 ; echo)

echo "WWW found in $WWW_ROOT"
echo "Installing…"

echo "$TEMP_PASS\
$TEMP_PASS" | adduser tictacwww

groupadd tictac

mkdir $TICTACDIR
mkdir $WWW_ROOT/files

chown -R tictacwww:tictac $TICTACDIR
chown -R tictacwww:tictac $WWW_ROOT/files

chmod -R 755 $TICTACDIR

echo "#!/bin/bash
cd /var/$TICTACDIR
git pull > /dev/null || rm -rf *; git clone https://github.com/threeheadedmonkeyteam/three_ticktactoe
gradle build > /dev/null
cp $TICTACDIR/html/files/* $WWW_ROOT/files/ > /dev/null
" > /usr/bin/updateTicTacToe

updateTicTacToe

ln -s $TICTACDIR/html/javadoc /$WWW_ROOT/javadoc
ln -s $TICTACDIR/html/codecoveragereport /$WWW_ROOT/codecoveragereport

echo "Please add updateTicTacToe to cron"
