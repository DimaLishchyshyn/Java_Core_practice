/*
 * LOGOS IT ACADEMY
 * Task 01 and 03
 */

package ua.lviv.igs.task_01_and_03;

import java.util.Scanner;

/**
 * @author Dime
 * @since JDK 1.8
 * @see Exception 
 */

public class Main {
	
	/**Create seasons*/
	enum Seasons {
		Winter, Spring, Summer, Fall;
		
		/*Create for array(case 6, case 7)*/
		public int a() {
			return 0;
		}
	}

	/**Create Months*/
	enum Month {
		March(Seasons.Spring, 31), April(Seasons.Spring, 30), May(Seasons.Spring, 31), June(Seasons.Summer, 30),
		July(Seasons.Summer, 31), August(Seasons.Summer, 31), September(Seasons.Fall, 30), October(Seasons.Fall, 31),
		November(Seasons.Fall, 30), December(Seasons.Winter, 31), January(Seasons.Winter, 31),
		February(Seasons.Winter, 28);

		private Seasons seasons;
		private Month month;
		private int day;

		/*Construction 1*/
		private Month(Seasons seasons) {
			this.seasons = seasons;
		}

		/*Construction 2*/
		private Month(Seasons seasons, int day) {
			this.seasons = seasons;
			this.day = day;
		}

		/*Construction 3*/
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

	}

	/**Menu from console*/
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

	public static void main(String[] args) throws Exception {

		/**Create arrays*/
		Month[] mas = Month.values();
		Seasons[] mas2 = Seasons.values();
		
		/*Scanner from input console*/
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		/*Create cycle from console*/
		while (true) {
			menu();
			int number = sc.nextInt();

			/**Exception*/
			if (number > 10) {
				throw new MyException("Invalid number, Please enter the number from the list");
			}

			/**Construction Switch*/
			switch (number) {

			/**case 1: make sure you need to do it*/
			case 1: {
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

			/**case 2: view all months with the same weather year*/
			case 2: {
				System.out.println("Введіть пору року");
				sc = new Scanner(System.in);
				String seasons = sc.next();

				boolean flag = false;

				for (Month m : mas) {
					if (m.getSeasons().name().equals(seasons)) {
						flag = true;
					}
				}

				if (flag) {

					@SuppressWarnings("unused")
					Seasons s = Seasons.valueOf(seasons);

					for (Month mont : mas) {
						if (mont.getSeasons().toString().equalsIgnoreCase(seasons)) {
							System.out.println(mont);
							
						}
					}
				}

				if (!flag) {
					System.out.println("Така пора року не існує.");
				}
				break;
			}

			/**case 3: view all months that have days*/
			case 3: {

				int a = 30;

				for (Month m : Month.values()) {
					if (m.day == a) {
						System.out.println(m + " " + m.day + " днів");

					}

				}

				break;
			}
			
			/**case 4: display all months with fewer days on the screen*/
			case 4: {

				int a = 30;

				for (Month m : Month.values()) {
					if (m.day < a) {
						System.out.println(m + " " + m.day + " днів");

					}

				}

				break;
			}

			/**case 5: display all months that have more days on the screen*/
			case 5: {

				int a = 30;

				for (Month m : Month.values()) {
					if (m.day > a) {
						System.out.println(m + " " + m.day + " день");

					}

				}

				break;
			}

			/**case 6: display the following message of the year*/
			case 6: {

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
						/*Exception*/
						throw new MyException(""+ mas2[a + 1]);
					}
				}
				if (!flag) {
					System.out.println("Така пора року не існує.");
				}
				break;
			}

			/**case 7: display the previous year screen*/
			case 7: {

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

			/**case 8: display all months that have a couple of days on the screen*/
			case 8: {
				System.out.println("Mісяці які мають парну кількість днів:");

				for (Month m : Month.values()) {

					if (m.day % 2 == 0) {
						System.out.println(m);
					}
				}

				break;
			}

			/**case 9: display all months that have an uneven number of days*/
			case 9: {
				System.out.println("Mісяці які мають непарну кількість днів:");

				for (Month m : Month.values()) {

					if (m.day % 2 == 1) {
						System.out.println(m);

					}
				}

				break;
			}

			/**case 10: the number of days displayed on the screen 
			 * or entered from the console*/
			case 10: {

				System.out.println("Введіть місяць");
				sc = new Scanner(System.in);
				String month = sc.next();

				@SuppressWarnings("unused")
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
