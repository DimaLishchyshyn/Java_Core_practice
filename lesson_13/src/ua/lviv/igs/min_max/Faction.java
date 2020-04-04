package ua.lviv.igs.min_max;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Faction {

	private String factionName;

	public Faction(String factionName) {
		super();
		this.factionName = factionName;
	}

	

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	public ArrayList<Deputy> getFactionArray() {
		return factionArray;
	}

	public void setFactionArray(ArrayList<Deputy> factionArray) {
		this.factionArray = factionArray;
	}



	ArrayList<Deputy> factionArray = new ArrayList<Deputy>();

	@SuppressWarnings({ "unused", "resource" })
	public void addDeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите фамилию депутата:");
		String surname = scanner.next();
		System.out.println("Введите имя депутата:");
		String name = scanner.next();
		System.out.println("Введите возраст депутата:");
		int age = scanner.nextInt();
		System.out.println("Введите рост депутата:");
		int height = scanner.nextInt();
		System.out.println("Введите вес депутата:");
		int weight = scanner.nextInt();
		System.out.println("Берет ли депутат взятки (true/false):");
		boolean bribery = scanner.nextBoolean();

		Deputy deputy = new Deputy(weight, weight, name, name, name, weight, bribery);

		if (deputy.isBribeTaker()) {
			deputy.addBribery();
		}

		factionArray.add(deputy);
		System.out.println("Депутат " + deputy.toString() + " успешно добавлен во фракцию!");
	}
	
	@SuppressWarnings("resource")
	public void removeDeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите фамилию депутата:");
		String surname = scanner.next();
		System.out.println("Введите имя депутата:");
		String name = scanner.next();

		boolean typeCorrect = isDeputyExists(factionArray, surname, name);

		if (typeCorrect) {

			Iterator<Deputy> iterator = factionArray.iterator();

			while (iterator.hasNext()) {
				Deputy nextDeputy = iterator.next();

				if (nextDeputy.getSurName().equalsIgnoreCase(surname) && nextDeputy.getName().equalsIgnoreCase(name)) {
					iterator.remove();
					System.out.println("Депутат " + nextDeputy.toString() + " успешно удален из фракции!");
				}
			}

		} else {
			System.out.println("Введенного депутата нет в данной фракции!");
		}
	}
	public void getBribeTakers() {
		System.out.println("Депутаты фракции, берущие взятки:");
		for (Deputy deputy : factionArray) {
			if (deputy.isBribeTaker()) {
				System.out.println(deputy.toString());
			}
		}
	}

	public void getLargestBribeTaker() {
		int bribeSize = 0;
		int deputyIndex = -1;

		for (int i = 0; i < factionArray.size(); i++) {
			if (factionArray.get(i).isBribeTaker()) {
				if (factionArray.get(i).getBriberySize() > bribeSize) {
					bribeSize = factionArray.get(i).getBriberySize();
					deputyIndex = factionArray.indexOf(factionArray.get(i));
				}
			}
		}

		if (deputyIndex >= 0) {
			System.out.println("Самый большой взяточник фракции " + factionArray.get(deputyIndex).toString());
		} else {
			System.out.println("В данной партии взяточников нет!");
		}
	}

	public void getAllDeputies() {
		System.out.println("Депутаты, состоящие в данной фракции:");
		for (Deputy deputy : factionArray) {
			System.out.println(deputy.toString());
		}
	}

	public void clearFaction() {
		factionArray.clear();
		System.out.println("Все депутаты были успешно удалены из фракции!");
	}

	static boolean isDeputyExists(ArrayList<Deputy> factionArray, String surname, String name) {
		boolean flag = false;

		for (Deputy deputy : factionArray) {
			if (deputy.getSurName().equalsIgnoreCase(surname) && deputy.getName().equalsIgnoreCase(name)) {
				flag = true;
			}
		}

		return flag;
	}

	@Override
	public String toString() {
		return "Фракция \"" + factionName + "\"";
	}



	
}