package lesson_15;

import java.util.Scanner;

public class Main {

	static void consoleMenu() {
		System.out.println("Add Person");
		System.out.println("Add the Pet to the Person");
		System.out.println("Delete the Pet from the Person");
		System.out.println("Remove the Person from the club");
		System.out.println("Remove a specific animal from all owners");
		System.out.println("Show the club to the screen");
		System.out.println("Exit");

	}

	public static void main(String[] args) {
		ZooClub zooClub = new ZooClub();

		while (true) {
			consoleMenu();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			switch (scan.nextInt()) {
			case 1: {
				zooClub.addPerson();
				break;
			}
			case 2: {
				zooClub.addAnimal();
				break;
			}
			case 3: {
				zooClub.removeAnimal();
				break;
			}
			case 4: {
				zooClub.removePerson();
				break;
			}
			case 5: {
				zooClub.removeAnimalFromAllPerson();
				break;
			}
			case 6: {
				zooClub.getZooClub();
				break;
			}
			case 7: {
				System.out.println("Exit");
				System.exit(0);
			}
			default: {
				System.out.println("Enter number between 1 and 6");
				break;
			}
			}
		}
	}

}
