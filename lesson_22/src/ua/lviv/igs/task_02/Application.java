package ua.lviv.igs.task_02;

import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			throwCoin();
		}

	}
	
	public static void throwCoin() {

		int coin = (int) (int) (Math.random() * 2);
		coins(coin, n -> n == 1);
		
		}
	public static void coins(int coin, Predicate <Integer> pridicate) {	

		if (pridicate.test(coin)) {
			System.out.println("Орел");
		} else {
			System.out.println("Рєшка");
		}
	}

}
