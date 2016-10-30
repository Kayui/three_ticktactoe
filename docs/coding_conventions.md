Java Coding Conventions for TicTacToe

Coding Practices

* camelCasing for variable and function names.
* PascalCasing for class names and constructors.
* Spacing between all variables and operators.
* Curly braces should open in line and close in is own separate line.
* Curly braces should be used when optional.
* Variable assignments should each be in their own separate line
* Variable names should be descriptive.
* Class names should be descriptive.
* Vertical white space should be a single blank line.
* All comments should start with a space followed by a capital letter.


One example code containing most of the rules:
```java
public class DescriptiveClassName{
  public int descriptiveFunctionName(int player, int row){ // A very descriptive comment
          int variableOne;
          int variableTwo;
          for(int i = 0; i < 3; i++){
              if(variableOne != variableTwo){
                  return false;
              }
          }
          return true;
      }
  }

```

