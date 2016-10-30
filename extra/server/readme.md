# Server tools for Tic Tac Toe

updateTicTacToe is a simple script to pull regulary from git rep. if pulling fails (For example: git clone has not been called before)  then rep. is cloned

## HOW TO INSTALL
### AS ROOT

* Copy updateTicTacToe.sh to /usr/bin
* Create /var/TicTacToe or edit the directory specified in /usr/bin/updateTicTacToe.sh
* Create /var/www/html/files or edit the directory specified in /usr/bin/updateTicTacToe.sh

**PLEASE NOTE THAT /var/www/html should be the ROOT DIRECTORY OF YOUR HTTPD SERVER**

* Create a user and/or group that is a owner of /var/TicTacToe


For example: 
~~~~
mkdir /var/TicTacToe

useradd USERNAME
usermod -aG GROUPNAME USERNAME
groupadd GROUPNAME
chown -R USERNAME:GROUPNAME /var/TicTacToe 
chmod -R 755 /var/TicTacToe
~~~~


edit /etc/crontab and add something like:
~~~
01 * * * * USERNAME /usr/bin/updateTicTacToe >/dev/null 2>&1
∆
~~~
how many minutes between git-checks


**PLEASE TEST updateTicTacToe.sh before adding it to the cron job list**

**PLEASE TEST if cronjob is working by using crontab -e (as the user that owns /var/TicTacToe) and add the line:**
~~~~
01 * * * * /usr/bin/updateTicTacToe >/dev/null 2>&1
~~~
