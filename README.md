## quaternary-calc-3  

________________________________________________________________________________________________________________

# Quaternary Calculator  
![QC3_1](https://github.com/AustenLowder2002/quaternarycalculatorgroup3/assets/111900043/e7c3050d-1130-4e03-86ce-b07622b0aeb4)  

![QC3_2](https://github.com/AustenLowder2002/quaternarycalculatorgroup3/assets/111900043/3e52e413-0113-49b2-9ed5-8e3c4084f3a6)  

![QC3_3](https://github.com/AustenLowder2002/quaternarycalculatorgroup3/assets/111900043/83b62396-fbc5-4ce6-a889-8e40f9bb05cd)  

![QC3_4](https://github.com/AustenLowder2002/quaternarycalculatorgroup3/assets/111900043/5cb49804-8152-4989-be6f-52742fcec52a)  

![QC3_5](https://github.com/AustenLowder2002/quaternarycalculatorgroup3/assets/111900043/e636bfb4-c44e-45f5-9121-0bedd8e87510)  

________________________________________________________________________________________________________________

### Team:  
* GUI = Hannah Johnston and Caige Rogers
* Calculator = Samuel Gross
* Converter + Tests = Austen Lowder
* Code Clean-up, Meeting Notes + README = Leah Casey

### About this Project:
This application looks like a regular calculator, but only has buttons for the numbers 0, 1, 2, 3. The user can enter a quaternary (base-4) number, choose an operation button (addition, subtraction, division, or multiplication), enter a second quaternary number, and see the result of the operation. The user can also enter just one quaternary number and then choose a button to see its square or square root. Finally, the user can toggle between displaying a quaternary number or its decimal equivalent.

### Technology:
This app is built using Java, JavaFX, Gradle, and object-oriented design.  

------------------------------------------------------------------------------------------------------------------

# How to Use This Application

Welcome to the Quaternary Calculator! This desktop application was built using IntelliJ IDEA, Java (JDK 18), Gradle, and JavaFX. JUnit was used for testing to ensure the reliability and accuracy of calculations.

## Table of Contents
1. [Introduction](#introduction)
2. [Installation](#installation)
3. [Getting Started](#getting-started)
4. [Basic Operations](#basic-operations)
5. [Advanced Features](#advanced-features)  

## 1. Introduction <a name="introduction"></a>

The Quaternary Calculator is a desktop application designed to perform mathematical operations in base-4 (quaternary) by default. It allows you to perform basic arithmetic calculations, as well as more advanced operations like square, square root, addition, subtraction, multiplication, and division—all in the quaternary numeral system.

## 2. Installation <a name="installation"></a>

To use the Quaternary Calculator, follow these installation steps:

1. Ensure you have Java Development Kit (JDK) 18 or later installed on your computer.
2. Clone or download this repository to your local machine.
3. Open the project using IntelliJ IDEA or your preferred Java development environment.
4. Build and run the application.

## 3. Getting Started <a name="getting-started"></a>

Upon launching the application, you'll be presented with a user-friendly interface featuring a buttons for entering equations and a result window for viewing the calculation results.

## 4. Basic Operations <a name="basic-operations"></a>

### Performing Arithmetic Operations  

1. Use the numeric buttons (0-3) to enter numbers.
2. Use the operation buttons (+, -, x, /) to select the desired operation.
3. Press the "Enter" button to calculate the result.

### Square and Square Root  

- To calculate the square of a number, press the "x²" button.
- To calculate the square root of a number, press the "√" button.

### Clearing the Equation  
- To clear the equation window, press the "Clear" button.

## 5. Advanced Features <a name="advanced-features"></a>

### Base-10 Conversion
- Toggle between base-4 and base-10 modes by clicking the "Toggle" button. The current mode is displayed below the result window. By default, the calculator starts and performs in Base-4, unless or until toggled.

________________________________________________________________________________________________________________

### Team Meetings  

**8/31/23** in-person, RB 353    
* Leah will set up the Git repo, set up the project, and push initial commit  
* Samuel set up Slack group for us  
* Discussed basic functions of the calculator  
* GUI is a big piece of the project, so two people will work on that
* Will discuss how to divide project tasks next meeting
 

**9/1/23** in-person (Hannah by FaceTime), RB 369   
* We'll use JavaFX  
* Classes discussed: To, From, Calculator, Main (GUI), Converter, Test  
* Added during meeting: Conversion (Quaternary/Decimal) function, some classes, function placeholders  
* Allocation of tasks:  
    - GUI - Hannah and Caige  
    - Calculator - Samuel  
    - Converter, Tests - Austen  
    - Clean-up + README - Leah  
* Next meeting: Sunday on Slack 

**9/3/23** on Slack
* new build and repository set up due to conflicts between JavaFX dependencies and Kotlin

**9/5/23** in-person, RB 353
* functions(s) will update values per button pressed rather than '+'-ng the values together and then performing the operation
* project should be mostly complete this evening  

**9/8/23 via Slack**
* Discussed fixed several errors, such digits showing up in display regardless of operations entered  
* A few team members experienced issues using Gradle, JavaFX, and/or JUnit; these were solved  
* Operation functions updated do address mathematical and running errors  
* Label added to display which mode the calculator is operating in  
* Screen shots added, README completed  
