package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import java.util.Scanner;

public class FoodTruckApp {

	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		int numTrucks = getFoodTrucks(kb);
		int menuOption;
		boolean notQuit = true;

		do {
			menuOption = printMenu(kb);
			switch (menuOption) {
			case 1:
				printTruckList(numTrucks);
				break;
			case 2:
				foodTruckAverage(fleet, numTrucks);
				break;
			case 3:
				getHighestRating(fleet, numTrucks);
				break;
			case 4:
				System.out.println("Thank you! Have a great day!");
				notQuit = false;
				break;
			default:
				System.out.println("That is not a valid menu option. Please select a number 1 - 4");
			}
		}
		while (notQuit);

	}

	public int getFoodTrucks(Scanner kb) {
		String name, foodType;
		int rating;
		int numTrucks = 0;
//		System.out.println(fleet.length);
		System.out.println("Enter information for up to 5 food trucks (enter \'quit\' for name to skip)");
		for (int i = 0; i < fleet.length; i++) {
			System.out.print("Truck " + (i+1) + " name: ");
			name = kb.next();
			if (name.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.print("Truck " + (i+1) + " food type: ");
			foodType = kb.next();
			System.out.print("Truck " + (i+1) + " rating: ");
			rating = kb.nextInt();
			FoodTruck truck = new FoodTruck(name, foodType, rating);
			fleet[i] = truck;
			numTrucks++;
		}
		return numTrucks;
	}

	public int printMenu(Scanner kb) {
		int choice = 0;
		System.out.println();
		System.out.println("   *** Menu Options ***   ");
		System.out.println(" 1: list of food trucks");
		System.out.println(" 2: Average Truck Rating ");
		System.out.println(" 3: Highest Rated Food Truck ");
		System.out.println(" 4: Exit the Program ");
		System.out.println();
		System.out.print("Please select an option: ");
		choice = kb.nextInt();
		System.out.println();
		return choice;
	}
	
	public void printTruckList(int numTrucks) {
		System.out.println("This of Food Trucks:");
		for (int i = 0; i < numTrucks; i++) {
			System.out.println(fleet[i]);
		}
		
	}
	
	public void foodTruckAverage(FoodTruck[] fleet, int numTrucks) {
		double sum = 0;
		for (int i = 0; i < numTrucks; i++) {
			sum += fleet[i].getRating();
		}
		sum = sum / numTrucks;
		System.out.println("The average rating of all food trucks is " + sum);
		return;
		
	}
	
	public void getHighestRating(FoodTruck[] fleet, int numTrucks) {
		double rating = 0;
		int arrayPos = 0;
		for (int i = 0; i < numTrucks; i++) {
			if (rating < fleet[i].getRating()) {
				rating = fleet[i].getRating();
				arrayPos = i;
			}
		}
		System.out.println("The highest rated food truck is: ");
		System.out.println(fleet[arrayPos]);
	}
}
