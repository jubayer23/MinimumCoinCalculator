# MinimumCoinCalculator

## Specification

* an application that given a number of pennies will calculate the minimum number of Sterling coins equivalent to that amount.
* Eg. 123p = 1 x £1, 1 x 20p, 1 x 2p, 1 x 1p

# Stacks

* TDD
* Java
* MVC
* JUnit 5
* Intellij 2021 (IDE)

# Approaching the challenge

* In order to develop this application I have taken TDD approach, that is, I have written my test cases first and write corresponding Java code to pass my unit test cases. 
* For design pattern I have choosen MVC ( Model-View-Controller) in order to make more testable, reusable and readable code base.
* The user input will be taken from the IDE terminal console and on the same display the output will be generated. There is no UI has been implemented
for this particular application.

# How to run the app

* Clone or download the repo to your computer and open in any suitable IDE, eg: Intellij, Netbeans. After importing Run the file MinCoinCalculator->MinCoinCalculator which
will run the application and wait for the user input.

# Key Features

* Successfully integrated TDD approach in order to make more testable and easily modifyable code. Have generated Unit-Test cases for validate user Input, format the user
input and verify the result of the method which generates minimum coins denominations while considering all the boundery/edge cases. 
* Have implemented custom eventlistener interface to get user data in main thread which facilates more readable and testable codes.
* Have followed MVC design pattern.
