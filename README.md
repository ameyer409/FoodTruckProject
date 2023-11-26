# FoodTruckProject
![alt text](istockphoto-1090191246-612x612.jpg)

## Project Description
This project prompts the user to enter a list of food trucks. The user inputs the food trucks name, what type of food it sells (tacos, pizza, etc), and a rating for the food truck. The user can enter up to 5 trucks, and can input less than 5 by submitting 'quit' as the name for a truck.

after inputting the truck information, the program will print a menu to the screen with options to print a list of the food trucks, print the average rating of the food trucks, print the highest rated truck, or exit the menu. The user can choose a menu option by inputing the number that corresponds to the menu option. If the user enters an invalid option, the program will tell them so and prompt them to reselect.

After choosing a valid option, the program will supply the request information, and then re-print the menu to the screen again. The user will then be prompted to select another option. The program will continue to do this until the user selects the option to exit the menu.

## How To Run
To run this program, you can compile from the command line using:

*javac FoodTruckApp.java*
*java FoodTruckApp*

or use eclipse's IDE run feature.

## Lesson's Learned
Learned about the basics of objects including their states(fields) and behaviors(methods). This was used to create Food truck objects that each had their own name, food type and rating.

Learned about arrays, and how to use them to store multiple primatives or objects of the same type. This was useful in creating a list of food trucks.

Learned about the idea of encapsulation and using 'private' so that the main program can't access and change an objects fields directly. This allows the user to input the information about the food truck when first running the program, but then protects that information from being altered later.

