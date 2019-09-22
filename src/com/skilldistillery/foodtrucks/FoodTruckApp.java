package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	boolean keepGoing = true;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruckApp fta = new FoodTruckApp();

		fta.run(kb);
		kb.close();
	}

	public void run(Scanner kb) {
		FoodTruck[] truckArray = addTrucks(kb);

		for (int i = 0; i < truckArray.length; i++) {// check null, if i find a null, make new array with no nulls
			if (truckArray[i] == null) {
				FoodTruck[] copyArray = new FoodTruck[i];

				for (int j = 0; j < copyArray.length; j++) {
					copyArray[j] = truckArray[j];
				}
				truckArray = copyArray;
				break;
			}
		}

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
					System.out.println(truckArray[i].toString());
				}
				System.out.println();
				break;
			case 2:
				double avg = 0;
				for (int i = 0; i < truckArray.length; i++) {// get null if I quit entering trucks. need to make new
																// array the length of the num. of trucks entered
					avg += truckArray[i].getRating(); // loop through the array, seeing how many elements aren't null.
														// make a new array?
				}
				avg /= truckArray.length;
				System.out.println("Average rating: " + avg);
				System.out.println();
				break;
			case 3:
				double max = truckArray[0].getRating();
				for (int i = 1; i < truckArray.length; i++) {
					if (truckArray[i].getRating() > max) {
						max = truckArray[i].getRating();
					}
				}
				System.out.println("The highest rating was a " + max);
				System.out.println();
				break;
			case 4:
				System.out.println("Quitting. Goodbye.");
				keepGoing = false;
				break;
			default:
				System.out.println("Error.");
				break;
			}

		} while (keepGoing);

	}

	public FoodTruck[] addTrucks(Scanner kb) {
		String name;
		String foodType;
		int rating;

		System.out.print("How many trucks would you like to enter? ");
		int numTrucks = kb.nextInt();
		kb.nextLine();

		FoodTruck[] truckArray = new FoodTruck[numTrucks];

		for (int i = 0; i < truckArray.length; i++) {
			System.out.print("Enter name of food truck " + (i + 1) + ", or \"quit\" to stop: ");
			name = kb.nextLine();
			if (!name.equalsIgnoreCase("quit")) {
				System.out.print("Enter type of food: ");
				foodType = kb.nextLine();
				System.out.print("Enter your rating for this truck: ");
				rating = kb.nextInt();
				System.out.println();
				kb.nextLine();

				FoodTruck ft = new FoodTruck(name, foodType, rating);
				truckArray[i] = ft;
			}
			if (name.equalsIgnoreCase("quit")) {
				break;
			}

		}

		return truckArray;

	}

}
