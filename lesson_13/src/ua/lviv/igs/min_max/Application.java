package ua.lviv.igs.min_max;

import java.util.Scanner;

public class Application {
	static void menu() {
		System.out.println();
		System.out.println("Введите 1, чтобы добавить фракцию в Верховную Раду");
		System.out.println("Введите 2, чтобы удалить фракцию из Верховной Рады");
		System.out.println("Введите 3, чтобы вывести все фракции в Верховной Раде");
		System.out.println("Введите 4, чтобы очистить введенную фракцию");
		System.out.println("Введите 5, чтобы вывести введенную фракцию");
		System.out.println("Введите 6, чтобы добавить депутата в фракцию");
		System.out.println("Введите 7, чтобы удалить депутата из фракции");
		System.out.println("Введите 8, чтобы вывести список взяточников");
		System.out.println("Введите 9, чтобы вывести самого большого взяточника");		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				SupremeCouncil.getInstance().addFaction();
				break;
			}
			
			case 2: {
				SupremeCouncil.getInstance().removeFaction();
				break;
			}
			
			case 3: {
				SupremeCouncil.getInstance().getAllFaction();
				break;
			}
			
			case 4: {
				SupremeCouncil.getInstance().clearFaction();
				break;
			}
			
			case 5: {
				SupremeCouncil.getInstance().getFaction();
				break;
			}
			
			case 6: {
				SupremeCouncil.getInstance().addDeputyToFaction();
				break;
			}
			
			case 7: {
				SupremeCouncil.getInstance().removeDeputyFromFaction();
				break;
			}
			
			case 8: {
				SupremeCouncil.getInstance().getBribeTakersFromFaction();
				break;
			}
			
			case 9: {
				SupremeCouncil.getInstance().getLargestBribeTakerFromFaction();
				break;
			}
			
			default: {
				System.out.println("Введите число от 1 до 9!");
				break;
			}
			}
		}
	}

}
