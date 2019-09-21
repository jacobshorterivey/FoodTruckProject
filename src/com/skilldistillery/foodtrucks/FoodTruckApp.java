package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	boolean keepGoing = false;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruckApp fta = new FoodTruckApp();

		fta.run(kb);
		kb.close();
	}

	public void run(Scanner kb) {
		FoodTruck[] truckArray = addTrucks(kb);

		do {
			System.out.println("Select an option: ");
			System.out.println("1.) List all trucks");
			System.out.println("2.) See average rating");
			System.out.println("3.) Display highest rating");
			System.out.println("4.) Quit");
			int menuChoice = kb.nextInt();

			switch (menuChoice) {
			case 1:
				for (int i = 0; i < truckArray.length; i++) {
					truckArray[i].toString();
				}
				break;
			case 2:
				int avg = 0;
				for (int i = 0; i < truckArray.length; i++) {
					avg += truckArray[i].getRating();
					avg /= truckArray.length;
				}
				System.out.println("Average rating: " + avg);
				break;
			case 3:
				int max = truckArray[0].getRating();
				for (int i = 1; i < truckArray.length; i++) {
					if (truckArray[i].getRating() > max) {
						max = truckArray[i].getRating();
					}
				}
				break;
			case 4:
				System.out.println("Quitting. Goodbye.");
				keepGoing = false;
				break;
			default:
				System.out.println("Error.");
				break;
			}

		} while (!keepGoing);

	}

	public FoodTruck[] addTrucks(Scanner kb) {
		String name;
		String foodType;
		int rating;

		FoodTruck[] truckArray = new FoodTruck[5];

		for (int i = 0; i < truckArray.length; i++) {
			System.out.print("Enter name of food truck, or \"quit\" to stop: ");
			name = kb.nextLine();
			if (!name.equalsIgnoreCase("quit")) {
				System.out.print("Enter type of food: ");
				foodType = kb.nextLine();
				System.out.print("Enter your rating for this truck: ");
				rating = kb.nextInt();
				kb.nextLine();

				FoodTruck ft = new FoodTruck(name, foodType, rating);
				truckArray[i] = ft;
			}

		}

		return truckArray;

	}

}
