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
		System.out.println("������� ������� ��������:");
		String surname = scanner.next();
		System.out.println("������� ��� ��������:");
		String name = scanner.next();
		System.out.println("������� ������� ��������:");
		int age = scanner.nextInt();
		System.out.println("������� ���� ��������:");
		int height = scanner.nextInt();
		System.out.println("������� ��� ��������:");
		int weight = scanner.nextInt();
		System.out.println("����� �� ������� ������ (true/false):");
		boolean bribery = scanner.nextBoolean();

		Deputy deputy = new Deputy(weight, weight, name, name, name, weight, bribery);

		if (deputy.isBribeTaker()) {
			deputy.addBribery();
		}

		factionArray.add(deputy);
		System.out.println("������� " + deputy.toString() + " ������� �������� �� �������!");
	}
	
	@SuppressWarnings("resource")
	public void removeDeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������� ��������:");
		String surname = scanner.next();
		System.out.println("������� ��� ��������:");
		String name = scanner.next();

		boolean typeCorrect = isDeputyExists(factionArray, surname, name);

		if (typeCorrect) {

			Iterator<Deputy> iterator = factionArray.iterator();

			while (iterator.hasNext()) {
				Deputy nextDeputy = iterator.next();

				if (nextDeputy.getSurName().equalsIgnoreCase(surname) && nextDeputy.getName().equalsIgnoreCase(name)) {
					iterator.remove();
					System.out.println("������� " + nextDeputy.toString() + " ������� ������ �� �������!");
				}
			}

		} else {
			System.out.println("���������� �������� ��� � ������ �������!");
		}
	}
	public void getBribeTakers() {
		System.out.println("�������� �������, ������� ������:");
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
			System.out.println("����� ������� ��������� ������� " + factionArray.get(deputyIndex).toString());
		} else {
			System.out.println("� ������ ������ ����������� ���!");
		}
	}

	public void getAllDeputies() {
		System.out.println("��������, ��������� � ������ �������:");
		for (Deputy deputy : factionArray) {
			System.out.println(deputy.toString());
		}
	}

	public void clearFaction() {
		factionArray.clear();
		System.out.println("��� �������� ���� ������� ������� �� �������!");
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
		return "������� \"" + factionName + "\"";
	}



	
}