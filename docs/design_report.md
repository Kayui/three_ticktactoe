# TicTacToe: Initial design

## Description
Initial design report for Late Semester ("TicTacToe") project for T-303-HUGB: Hugb√∫na√∞ar√√i, due 30th of October fall 2016 by students of Reykjav√≠k University Autho Andri Rafn √Åg√stsson,
Darri Valgar√sson, Edda Steinunn R√narsd√ttir, J√n √ñrn Arnarson and Sk√li Arnarsson.


## Features
Prior to implementation of the game, the team concieved various of features that were planned to implement for the project. The list of those features are listed below. Note that not all features have been implemented in the current version.

### Initial feature list
 * 1. A fully functional, playable game of the classic tictactoe
 * 2. A player can compete with another player
 * 3. A player can compete with the computer
 * 4. A computer can compete with another computer
 * 5. A player can pick from a number of maps to play
 * 6. Game saves number of games won by each player, number of games played and number of lost games
 * 7. A player can view his score, number of wins, losses, games played, draws and win/lose ratio
 * 8. The game can be played on a console
 * 9. The game can be played on the web


## Initial code design

Several classes and descriptions of their functions were initially thought to suffice and were concieved for our project. Our original concept for the softwares code is demonstrated in Java Pseudocode made prior to implementation of the game. The team listed various coding guidelines in another document called coding_conventions and should be located in the same folder as this one.

### Java pseudocode representation by class
The following pseudocode in Java is how the team originally thought of implementing the application. This code is of course a subject to change later on as members of the team progress with the programming.

#### MapPoint

```java
// Class that keeps track of what fields was chosen and on what board
// 0 is the default map if not super TicTacToe
Class MapPoint
    
	// Constructor uses functions in class to
	// determine what map is used, which point x
	// on map and which point y on map
	public MapPoint(int _map, int _pointX, int _pointY)

	// Returns point x on map
	public int x()
	
	// Returns point y on map
	public int y()

	// Returns which map is in use
	public int getMap()

```

#### UI

```java

// Parent class that sets the basic necessary UI functionality
Virtual Class UI

	// Function that displays a dialog with messages
	// and doesn't require user input
	public void msgbox(String message)
    	
	// Function that displays a dialog with messages
	// and requires a yes or no input from the user
	public boolean yesnobox(String message)
    
	// Function that displays a dialog with messages
	// and requires selection on a misc option from the user
	public int optionbox(String message, String[] options)
    
	// Function that displays a dialog
	// that the user chooses a field on the board
	public MapPoint pickOption(Map[] map)
    
	// Function that displays the board/map
	public void displayMaps(Map[] map)

```

#### Menu

```java
// Class that works on the UI
Class Menu
	// New Game / Exit Game
	public void mainMenu()
    
	// Player/CPU selection
	public void playerMenu()
    
	// Yes/No selection on Exit Game
	public void exitMenu()
    
	// A possible feature to implement.
    	//Changes to game etc.
	public void settings()

```

#### Map

```java
// Class containing logic of the game's grid and player's positions
Class Map

	// Initiates width x height game map as 2D array
	public void init(int width, int height)
    
	// Returns concurrent game status; if ongoing game
	// is still in progress, if either player has won
	// and if game has otherwise ended
    	public int isWon()
    
	// Returns status of point:
	// 0 if field is unoccupied
	// 1 if field is occupied by player one
	// 2 if field is occupied by player two
	public int getPoint(int point)
    
	// Confirms that field is empty
	public boolean fieldIsEmpty(int point)
     
	// Returns true for valid position request in grid
	// and places "player" in desired position
	// For invalid requests, function returns false
	public boolean setMove(int player, int point)

	// Returns overall game status:
	// Returns winner game status if either player won the game
	// Returns draw game status if the game has otherwise ended
	// Returns undecided game status if game is still in progress
	public int checkWin(int player, int point)
    
	// Functions that check various winning positions
	// Return true if game is won
	public boolean checkVerticalWin(int player, int row)
    	public boolean checkHorizontalWin(int player, int col)
    	public boolean checkDiagonalWin(int player, int col, int row)
    
	// Called if winner game status is determined by checkWin
	// Returns which player won game as game status
	public int isWinner(int player)
	
```

#### Game

```java
//TODO Purpose of Game class summed up
Class Game

	// Constructor
	public void Game()

	// Initials game and/or resets
	public void init(Player p1, Player p2)

	// While game is on, the gameLoop continuously
	// checks whose turn it is, gets input and resets grid
	// checks if game is won or ended then switches player.
	// When game ends the function resolves to get results
	public void gameLoop()
	
	// Checks whose turn it is
	public int checkWhosTurn()

	// Switches active player, called after each turn
	public void switchPlayer()

	// Determines how to resolve when game has ended
	// Shows who won and who lost if game is won
	// Shows that game ended in draw if no one won
	public void resolve()

	// Places user input on grid correctly
	public void setMove(int player, MapPoint point)
	
	// Checks if user has won game
	public void checkForWin(int player, MapPoint point)

```

#### Player

```java

// An abstract class implementing player logic that both
// computer player and human player inherit from 
Class Player

	// Get player input
	public abstract MapPoint getPoint()

	// Manages how many games player has won
	public void gameWon()

	// Manages how many games player has lost
	public void gameLost()

	// Manages how many games have ended in draw
	public void gameDraw()

	// Manages how many games have been played in a session
	public void gamePlayed()

	// Returns how many games player has won
	public int getGamesWon()

	// Returns how many games player has lost
	public int getGamesLost()

	// Returns how many games ended in a draw
	public int getGamesDraw()

	// Returns how many games have been played in
	// current session
	public int getGamesPlayed()

```

#### Computer Player

```java
// Class extending player to mimic a player
Class ComputerPlayer extends Player

	//Generates a random input that gets to grid
	public MapPoint getPoint()
```

#### Human Player

```java
// Class extending Player which allows user to participate in game
Class HumanPlayer extends Player

	// Get user input to grid
	public MapPoint getPoint()

	//Checks if input in valid, i.e. on grid
	public boolean pointIsValid(int point)

```



## Post-implementation

### Major changes to initial feature list
Some changes were made to our initial feature list according to better estimation of the features' scope and ideas for new features. Major changes made to the feature list are listed below:

 * Feature 5 - Players can choose from a number of maps
 	* This feature was not fully implemented due to the feature's large scope and time constraints.
 * Feature 7 - A player can view statistics such as the player's score, number of wins, losses, games played, draws and win/lose ratio
 	 * This feature was not implemented due time time-constraints. The team deemed it unnecessary compared to other features. The application however keeps track of all these statistics but current version of the application is not accessable to the player.
 * Feature 9 - The game can be played on the web
	 * The feature is not available due to time constraints

### Major changes to inital code design
Changes were made to our initial code design for simplification purposes and better class relationships. Minor changes are disregarded such as functions naming conventions in this section, but major changes to the code design are listed below:

* The function checkDiagonalWin in map class was initially thought to check any case of diagonal win. However the function alone did not suffice and this functionality was therefore split into two functions that serve the purpose of checking any case of diagonal win
* Game statuses were originally planned to implement as enum, but for simplification purposes were changed to constraints so a class containing only these constraints was added; the GameStatus class.
* Start function added in Game class to simplify class function.
* A couple of functions were added that solely offer feedback or error messages.
* More functions were added to HumanPlayer class because original design of functions did not suffice, or would have been cluttered and illegible.
* A new class simply called TicTacToe was created to offer a simple main menu for the game.



## Useful Informaton
Chapter reserved for useful information for team. A place to commit notes-to-selves and such.

### Starting a new project
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
