# Development Manual
How to get the project to build on a fresh machine
### Source control client and access to source control
- Git is already installed on the dev machine
- https://github.com/threeheadedmonkeyteam/three_ticktactoe
- It is impossible to push directly to the master branch, use the following instead:
  - __logic__ branch for game logic
  - __ui__ branch for console ui for playing the game and ui type handling
  - __servertool__ branch for implementing TODO EXPLAIN
  - __documentation__ branch for working on the /docs folder
  - __webui__ branch for implementing webui for playing the game


### Build environment
- __Gradle__ for general project handling
- __Travis__ for continuous integration
- __Git__ for source control
- __Java8__ as a development language for business logic
- A deticated development server has been set up at andrirafn.is
  - The machine is running CentOS 7.2 x64 with 512 MB memory and a 20 GB HD.
  - Various information can be seen by browsing to andrirafn.is such as a Code Coverage Report for the latest build on the master branch, Javadocs and all versions of the jar artifact built on the master branch.
  - If you don't have a user set up bug the administrator
  - To build, test and generate branch specific reports run the modified ./gradlew
  - Pushing to your current branch will initiate a check on travis, if everything checks out it possible to merge your branch with master. 

### Other necessary dependencies
The development cycle depends on __Junit__ for java unit testing and __Jacoco__ for the code coverage reports.

these are handled internally by __Gradle__.

### A Friendly Note
Pair programming is encouraged, do not be afraid to pair up with a fellow developer. This project is a team effort that belongs to us all

### Extra Feature for website part of the project
see /extra/server/readme.md for install instructions
