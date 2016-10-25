# Initial Design of TicTacToe

### Description
TicTacToe fyrir Hugbnaðarfræði, mjög flott og allt það.

### How to start a new project
Steps to initiate a new project from the command line:
* create a folder to hold your project and cd into it
* gradle init --type java-library
* create a file called .travis.yml
* create a file called .gitignore
* check contents of .travis.yml and .gitignore as listed below
* create a public git repo on github.com
* git init
* git add .
* git commit -m "Initial Push"
* git remote add origin url_of_github_repo
* git push -u origin master

The bare minimum contained within the .travis.yml file is the following:
```json
language: java
jdk:
- oraclejdk8
```

and the bare minimum contained within the .gitignore file is the following:
```json
.gradle
/build/
```

### Git Branching and you
#### A few handy commands:
* git branch
  * prints your current active branch
* git checkout -b "some name"
  * creates a new branch with the given name
* git checkout "some name"
  * switches to the branch with the given name
* git push -u origin "some name"
  * pushes your commits to the branch with the given name

Pushing to a non-master branch will create a pull request offer at the top of the repository on github, if you choose to create a pull request github and travis will
work their tests and let you know if it passed. \
If it does it's most likely safe to merge the pull request with the master branch.


### Java Code Plan
Java Pseudocode plan:

```java
// Class that keeps track of what fields was chosen and on what board
// 0 is the default map if not super tictactoe
public class MapPoint
// Constructor
    MapPoint(int _map, int _point)
    int map; // Which map it points to
    int point; // Which point on the map
public class GameStatus
 public final static int PLAYER1_WON = 1;
 public final static int PLAYER2_WON = 2;
 public final static int DRAW = -1;
 public final static int UNDECIDED = 0;


public class Map 
 protected int map[] // An int with the map
 public void init(int width, int height) 
 public int hasWon() // returns Gamestatus. 
 public boolean setMove(int player, int point) // sets move, returns true if move is possible, else false
 public int getPoint(int point) // returns point, 0 if unoccupied 1 if player1 2 if player 2

public class Game
   private Map[] maps
   public Game() // Constructor
   public void init() // init and reset
   public void gameLoop() // the game loop
   public int hasWon // returns GameStatus

public abstract class Player
 public abstract int getPoint() // Get user input or computer input
 protected int games_played;
 protected int games_won;
 protected int games_lost;
 public void gameWon();
 public int getGamesWon();
 public void gameLost();
 public int getGamesLost();
 public int getGamesPlayed();
 
public class TicTacToe
 public static void main(Strings args[])
 


###USER INTERFACE PSEUDO-CODE
```

```java
// parent class that sets the basic necessary UI functionality
public abstract class ui
// Function that displays a dialog with messages
    // and doesn't require user input
public abstract void msgbox(String message)
    
    // Function that displays a dialog with messages
    // and requires a yes or no input from the user
    public abstract boolean yesnobox(String message)
    
    // Function that displays a dialog with messages
    // and requires selection on a misc option from the user
    public abstract int optionbox(String message, String[] options)
    
    // Function that displays a dialog
    // that the user chooses a field on the board
    public abstract MapPoint pickOption(Map[] map)
    
    // Function that displays the board/map
public abstract void displayMaps(Map[] map)
```
```java
// Class that uses the ui class
Class Menu  
  public void mainMenu()   // New Game / Exit Game
  public void playerMenu() // Player/CPU selection
  public void exitMenu()   // Yes/No selection on Exit Game
  public void settings()   // TODOLATER!

```
