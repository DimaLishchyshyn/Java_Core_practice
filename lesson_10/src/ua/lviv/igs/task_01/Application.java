package ua.lviv.igs.task_01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws Exception {

		Replace();
		numberOfWords();
		numberOfSentences();
		wordOfText();
		isPalindrome();

	}

	static void wordOfText() {
		
		System.out.println("5) 6)");

		String text = "Діти будували гірки .Вони поливали її водою." + " Зіна і Клава спускалися з гірки на санях.";

		System.out.println("Діти будували гірки.Вони поливали її водою." + " Зіна і Клава спускалися з гірки на санях.");

		String[] words = text.split(" ");
		int count = 1;
		int max = 0;
		String mostRepeatableWord = null;

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count = count + 1;
					if (count > max) {
						max = count;
						mostRepeatableWord = words[i];
					}
					words[j] = "0";
				}
			}
			if (words[i] != "0") {

				count = 1;
			}
		}

		System.out.println("Найчастіше повторюється слово" + mostRepeatableWord + " = " + max + "рази");

	}

	static void numberOfSentences() {
		
		System.out.println("4)");

		String text = "Діти будували гірку.Вони поливали її водою." + " Зіна і Клава спускалися з гірки на санях.";

		System.out
				.println("Діти будували гірку.Вони поливали її водою." + " Зіна і Клава спускалися з гірки на санях.");

		int sentence = -1;

		if (text.length() != 0) {
			sentence++;

			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == '.') {

					sentence++;
				}
			}
		}

		System.out.println("Введено " + sentence + " речення.");
	}

	static void numberOfWords() {
		
		System.out.println("3)");
		String sentence = "Діти будували гірку.";
		System.out.println("Діти будували гірку.");

		int count = 0;

		if (sentence.length() != 0) {
			count++;

			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.charAt(i) == ' ') {

					count++;
				}
			}
		}

		System.out.println("Введено " + count + " слів.");
	}

	static void Replace() {
		
		System.out.println("2)");

		String str = "Доброго ранку!!!";

		String s = str.replace("а", "-").replace("е", "-").replace("є", "-").replace("и", "-").replace("і", "-")
				.replace("ї", "-").replace("о", "-").replace("у", "-").replace("ю", "-").replace("я", "-");

		System.out.println(str);
		System.out.println(s);

	}

	static void isPalindrome() throws Exception {

		String original, reverse = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("1)");
		System.out.println("Введіть слово паліндром:");
		original = sc.nextLine().toLowerCase();

		int lenght = original.length();
		System.out.println(lenght);

		if (lenght >= 6) {
			throw new MyException("STOP");
		}

		for (int i = lenght - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("паліндром.");
		else
			System.out.println("не паліндром.");
	}

}
