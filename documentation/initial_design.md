# TicTacToe
## Initial design

### Description
TicTacToe for Hugbúnaðarfræði, very nice.



### Features
//TODO Prior to implementation of the game, the team concieved various of features that were planned to implement for the project. The list of features were 

#### Initial feature list

 * Game saves number of games won by each player, number of games played and number of lost games
 * A win/lose ratio for current session



### Initial code design

Seven classes and descriptions of their functions were initially thought to suffice and were concieved for our project. Our original concept for the software's code is demonstrated later in Java Pseudocode made prior to implementation of the game. The team listed various coding guidelines as well 

#### Coding guidelines
//TODO

#### Java pseudocode representation

```java
// Class that keeps track of what fields was chosen and on what board
// 0 is the default map if not super tictactoe
Class MapPoint

```

```java
// Parent class that sets the basic necessary UI functionality
Virtual Class UI

```

```java
// Class that works on the UI
Class Menu

```

```java
// Class containing logic of the game's grid and player's positions
Class Map
	
```

```java
//TODO Purpose of Game class summed up
Class Game

```

```java
//TODO Purpose of Player class summed up
Class Player

```


```java
//TODO Purpose of CPU class summed up
Class CPU

```



### Post-implementation

#### Major changes to initial feature list
//TODO Some changes were made to our initial feature list according to better estimation of the features' scope and ideas for new features. Major changes made to the feature list are listed below:

 * Feature 1
 	* Removed due to...
 * Feature 2
 	 * Added due to...

#### Major changes to inital code design
//TODO Changes were made to our initial code design for simplification purposes and better class relationships. Minor changes are disregarded such as functions' naming conventions in this section, but major changes to the code design are listed below:

* The function checkDiagonalWin in map class was initially thought to check any case of diagonal win. However the function alone did not suffice and this functionality was therefore split into two functions that serve the purpose of checking any case of diagonal win




### Useful Informaton
(Notes to selves as a team. Decide later if kept in report)

#### Starting a new project
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
