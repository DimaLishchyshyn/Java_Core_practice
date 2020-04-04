package ua.lviv.igs;

import java.util.Scanner;

public class ApplicationThreadRunnable {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("1 Thread ");
		System.out.println("2 Runnable ");
		switch (scan.nextInt()) {
		case 1:
			MyThread myThread = new MyThread();
			myThread.start();
			break;

		case 2:
			MyRunnable myRunnable = new MyRunnable();
			new Thread(myRunnable).start();
			break;
		}

	}

}

class MyThread extends Thread {

	public void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть к≥льк≥сть чисел ф≥боначч≥:");
		int array = sc.nextInt();

		int[] f = new int[array];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < array; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		for (int j = 0; j < array; j++) {
			System.out.print(f[j] + " ");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyRunnable implements Runnable {

	public void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть к≥льк≥сть чисел ф≥боначч≥:");
		int array = sc.nextInt();

		int[] f = new int[array];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < array; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		for (int j = array - 1; j >= 0; j--) {
			System.out.print(f[j] + " ");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
