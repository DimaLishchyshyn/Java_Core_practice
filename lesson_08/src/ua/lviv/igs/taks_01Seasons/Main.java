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
		System.out.println("Натисніть 1 щоб, Перевірити чи є такий місяць");
		System.out.println("Натисніть 2 щоб, Вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 3 щоб, Вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натисніть 4 щоб, Вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натисніть 5 щоб, Вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натисніть 6 щоб, Вивести на екран наступну пору року");
		System.out.println("Натисніть 7 щоб, Вивести на екран попередню пору року");
		System.out.println("Натисніть 8 щоб, Вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 9 щоб, Вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 10 щоб, Вивести на екран чи введений з консолі місяць має парну кількість днів");
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
				System.out.println("Введіть місяць");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;

				for (Month m : mas) {

					if (m.name().equals(month)) {
						System.out.println("Такий місяць існує.");
						flag = true;
					}

				}

				if (!flag) {
					System.out.println("Такий місяць не існує.");
				}
				break;
			}

			case "2": {
				System.out.println("Введіть пору року");
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
					System.out.println("Така пора року не існує.");
				}
				break;
			}

			case "3": {

				int a = 30;

				for (Month m : Month.values()) {
					if (m.day == a) {
						System.out.println(m + " " + m.day + " днів");

					}

				}

				break;
			}

			case "4": {

				int a = 30;

				for (Month m : Month.values()) {
					if (m.day < a) {
						System.out.println(m + " " + m.day + " днів");

					}

				}

				break;
			}

			case "5": {

				int a = 30;

				for (Month m : Month.values()) {
					if (m.day > a) {
						System.out.println(m + " " + m.day + " день");

					}

				}

				break;
			}

			case "6": {

				System.out.println("Введіть пору року");
				sc = new Scanner(System.in);
				String se = sc.next();

				boolean flag = false;

				for (Seasons s : mas2) {

					if (s.name().equals(se)) {
						System.out.println("Наступна пора року");
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
					System.out.println("Така пора року не існує.");
				}
				break;
			}

			case "7": {

				System.out.println("Введіть пору року");
				sc = new Scanner(System.in);
				String se = sc.next();

				boolean flag = false;

				for (Seasons s : mas2) {

					if (s.name().equals(se)) {
						System.out.println("Попередня пора року");
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
					System.out.println("Така пора року не існує.");
				}
				break;
			}

			case "8": {
				System.out.println("Mісяці які мають парну кількість днів:");

				for (Month m : Month.values()) {

					if (m.day % 2 == 0) {
						System.out.println(m);
					}
				}

				break;
			}

			case "9": {
				System.out.println("Mісяці які мають непарну кількість днів:");

				for (Month m : Month.values()) {

					if (m.day % 2 == 1) {
						System.out.println(m);

					}
				}

				break;
			}

			case "10": {

				System.out.println("Введіть місяць");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;

				for (Month m : Month.values()) {

					if (m.name().equals(month)) {

						flag = true;
						if (m.day % 2 == 0) {
							System.out.println("Місяць: " + m + " являється парним.");

						} else {
							System.out.println("Місяць: " + m + " не являється парним.");
						}
					}

				}

				break;
			}

			}
		}
	}
}
