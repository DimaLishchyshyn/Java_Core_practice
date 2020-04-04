package ua.lviv.igs.min_max;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class SupremeCouncil {

	private static SupremeCouncil instance = new SupremeCouncil();

	private SupremeCouncil() {
	}

	public static SupremeCouncil getInstance() {
		if (instance == null) {
			instance = new SupremeCouncil();
		}

		return instance;
	}

	
	ArrayList<Faction> supremeCouncilArray = new ArrayList<Faction>();
	@SuppressWarnings("unused")
	private String factionName;

	@SuppressWarnings("resource")
	public void addFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� �������:");
		String factionName = scanner.next();

		Faction faction = new Faction(factionName);

		supremeCouncilArray.add(faction);
		System.out.println(faction.toString() + " ������� ��������� � �������� ����!");
	}

	@SuppressWarnings({ "resource", "unused" })
	public void removeFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� �������:");
		String factionName = scanner.next();

		Object FactionName;
		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);

		if (typeCorrect) {

			Iterator<Faction> iterator = supremeCouncilArray.iterator();

			while (iterator.hasNext()) {
				Faction nextFaction = iterator.next();

				if (nextFaction.getFactionName().equalsIgnoreCase(factionName)) {
					iterator.remove();
					System.out.println(nextFaction.toString() + " ������� ������� �� ��������� ����!");
				}
			}

		} else {
			System.out.println("��������� ������� � ��������� ���� ���!");
		}
	}

	public void getAllFaction() {
		System.out.println("�������, ������������������ � �������� ����:");
		for (Faction faction : supremeCouncilArray) {
			System.out.println(faction.toString());
		}
	}

	@SuppressWarnings("resource")
	public void clearFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� �������:");
		String factionName = scanner.next();

		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);

		if (typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getFactionName().equalsIgnoreCase(factionName)) {
					faction.clearFaction();
				}
			}

		} else {
			System.out.println("��������� ������� � ��������� ���� ���!");
		}
	}

	@SuppressWarnings("resource")
	public void getFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� �������:");
		String factionName = scanner.next();

		for (Faction faction : supremeCouncilArray) {
			if (faction.getFactionName().equalsIgnoreCase(factionName)) {
				System.out.println(faction.toString());
				faction.getAllDeputies();
			}
		}
	}

	@SuppressWarnings("resource")
	public void addDeputyToFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� �������:");
		String factionName = scanner.next();

		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);

		if (typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getFactionName().equalsIgnoreCase(factionName)) {
					faction.addDeputy();
				}
			}

		} else {
			System.out.println("��������� ������� � ��������� ���� ���!");
		}
	}
	
	@SuppressWarnings("resource")
	public void removeDeputyFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� �������:");
		String factionName = scanner.next();

		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);

		if (typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getFactionName().equalsIgnoreCase(factionName)) {
					faction.removeDeputy();
				}
			}

		} else {
			System.out.println("��������� ������� � ��������� ���� ���!");
		}
	}
	
	@SuppressWarnings("resource")
	public void getBribeTakersFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� �������:");
		String factionName = scanner.next();

		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);

		if (typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getFactionName().equalsIgnoreCase(factionName)) {
					faction.getBribeTakers();
				}
			}

		} else {
			System.out.println("��������� ������� � ��������� ���� ���!");
		}
	}
	
	@SuppressWarnings("resource")
	public void getLargestBribeTakerFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� �������:");
		String factionName = scanner.next();

		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);

		if (typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getFactionName().equalsIgnoreCase(factionName)) {
					faction.getLargestBribeTaker();
				}
			}

		} else {
			System.out.println("��������� ������� � ��������� ���� ���!");
		}
	}
	
	public void getAllDeputiesFromFaction() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �������� �������:");
		String factionName = scanner.next();

		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);

		if (typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getFactionName().equalsIgnoreCase(factionName)) {
					faction.getAllDeputies();;
				}
			}

		} else {
			System.out.println("��������� ������� � ��������� ���� ���!");
		}
	}
	
	static boolean isFactionExists(ArrayList<Faction> supremeCouncilArray, String factionName) {
		boolean flag = false;

		for (Faction faction : supremeCouncilArray) {
			if (faction.getFactionName().equalsIgnoreCase(factionName)) {
				flag = true;
			}
		}

		return flag;
	}

}