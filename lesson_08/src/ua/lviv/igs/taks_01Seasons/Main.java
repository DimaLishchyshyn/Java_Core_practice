package ua.lviv.igs.taks_01Seasons;

import java.util.Scanner;

import ua.lviv.igs.taks_01Seasons.Main.Month;

@SuppressWarnings("unused")
public class Main {

	enum Seasons {
		Winter, Spring, Summer, Fall;

		public int a() {
			return 0;
		}

	}

	enum Month {
		March(Seasons.Spring, 31), April(Seasons.Spring, 30), May(Seasons.Spring, 31), June(Seasons.Summer, 30),
		July(Seasons.Summer, 31), August(Seasons.Summer, 31), September(Seasons.Fall, 30), October(Seasons.Fall, 31),
		November(Seasons.Fall, 30), December(Seasons.Winter, 31), January(Seasons.Winter, 31),
		February(Seasons.Winter, 28);

		private Seasons seasons;
		private Month month;
		private int day;

		private Month(Seasons seasons) {
			this.seasons = seasons;
		}

		private Month(Seasons seasons, int day) {
			this.seasons = seasons;
			this.day = day;
		}

		private Month(int day) {
			this.day = day;
		}

		public Seasons getSeasons() {
			return seasons;
		}

		public Month getMonth() {
			return month;
		}

		public int getDay() {
			return day;
		}

		public int a() {
			return 0;
		}

	}

	static void menu() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("�������� 1 ���, ��������� �� � ����� �����");
		System.out.println("�������� 2 ���, ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3 ���, ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4 ���, ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5 ���, ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6 ���, ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7 ���, ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8 ���, ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9 ���, ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10 ���, ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
	}

	public static void main(String[] args) {

		Month[] mas = Month.values();
		Seasons[] mas2 = Seasons.values();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {

			case "1": {
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;

				for (Month m : mas) {

					if (m.name().equals(month)) {
						System.out.println("����� ����� ����.");
						flag = true;
					}

				}

				if (!flag) {
					System.out.println("����� ����� �� ����.");
				}
				break;
			}

			case "2": {
				System.out.println("������ ���� ����");
				sc = new Scanner(System.in);
				String monthSc = sc.next();

				boolean flag = false;

				for (Month m : mas) {
					if (m.getSeasons().name().equals(monthSc)) {
						flag = true;
					}
				}

				if (flag) {

					Seasons s = Seasons.valueOf(monthSc);

					for (Month mont : mas) {
						if (mont.getSeasons().toString().equalsIgnoreCase(monthSc)) {
							System.out.println(mont);
						}
					}
				}

				if (!flag) {
					System.out.println("���� ���� ���� �� ����.");
				}
				break;
			}

			case "3": {

				int a = 30;

				for (Month m : Month.values()) {
					if (m.day == a) {
						System.out.println(m + " " + m.day + " ���");

					}

				}

				break;
			}

			case "4": {

				int a = 30;

				for (Month m : Month.values()) {
					if (m.day < a) {
						System.out.println(m + " " + m.day + " ���");

					}

				}

				break;
			}

			case "5": {

				int a = 30;

				for (Month m : Month.values()) {
					if (m.day > a) {
						System.out.println(m + " " + m.day + " ����");

					}

				}

				break;
			}

			case "6": {

				System.out.println("������ ���� ����");
				sc = new Scanner(System.in);
				String se = sc.next();

				boolean flag = false;

				for (Seasons s : mas2) {

					if (s.name().equals(se)) {
						System.out.println("�������� ���� ����");
						flag = true;
					}

				}

				if (flag) {
					Seasons s2 = Seasons.valueOf(se);
					int a = s2.a();

					if (a == (mas2.length - 1)) {
						a = 0;
						System.out.println(mas2[a]);
					} else {
						System.out.println(mas2[a + 1]);
					}
				}
				if (!flag) {
					System.out.println("���� ���� ���� �� ����.");
				}
				break;
			}

			case "7": {

				System.out.println("������ ���� ����");
				sc = new Scanner(System.in);
				String se = sc.next();

				boolean flag = false;

				for (Seasons s : mas2) {

					if (s.name().equals(se)) {
						System.out.println("��������� ���� ����");
						flag = true;
					}

				}

				if (flag) {
					Seasons s2 = Seasons.valueOf(se);
					int a = s2.a();

					if (a == (mas2.length - 1)) {
						a = 0;
						System.out.println(mas2[a]);
					} else {
						System.out.println(mas2[a + 3]);
					}
				}
				if (!flag) {
					System.out.println("���� ���� ���� �� ����.");
				}
				break;
			}

			case "8": {
				System.out.println("M����� �� ����� ����� ������� ���:");

				for (Month m : Month.values()) {

					if (m.day % 2 == 0) {
						System.out.println(m);
					}
				}

				break;
			}

			case "9": {
				System.out.println("M����� �� ����� ������� ������� ���:");

				for (Month m : Month.values()) {

					if (m.day % 2 == 1) {
						System.out.println(m);

					}
				}

				break;
			}

			case "10": {

				System.out.println("������ �����");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;

				for (Month m : Month.values()) {

					if (m.name().equals(month)) {

						flag = true;
						if (m.day % 2 == 0) {
							System.out.println("̳����: " + m + " ��������� ������.");

						} else {
							System.out.println("̳����: " + m + " �� ��������� ������.");
						}
					}

				}

				break;
			}

			}
		}
	}
}
