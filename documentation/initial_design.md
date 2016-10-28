# TicTacToe: Initial design

## Description
TicTacToe for Hugbúnaðarfræði, very nice.



## Features
//TODO Prior to implementation of the game, the team concieved various of features that were planned to implement for the project. The list of those features are listed below.

### Initial feature list

 * Game saves number of games won by each player, number of games played and number of lost games
 * A win/lose ratio for current session



## Initial code design

Seven classes and descriptions of their functions were initially thought to suffice and were concieved for our project. Our original concept for the software's code is demonstrated later in Java Pseudocode made prior to implementation of the game. The team listed various coding guidelines as well

### Coding guidelines
//TODO

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
//TODO Some changes were made to our initial feature list according to better estimation of the features' scope and ideas for new features. Major changes made to the feature list are listed below:

 * Feature 1
 	* Removed due to...
 * Feature 2
 	 * Added due to...

### Major changes to inital code design
//TODO Changes were made to our initial code design for simplification purposes and better class relationships. Minor changes are disregarded such as functions' naming conventions in this section, but major changes to the code design are listed below:

* The function checkDiagonalWin in map class was initially thought to check any case of diagonal win. However the function alone did not suffice and this functionality was therefore split into two functions that serve the purpose of checking any case of diagonal win




## Useful Informaton
(Notes to selves as a team. Decide later if kept in report)

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
