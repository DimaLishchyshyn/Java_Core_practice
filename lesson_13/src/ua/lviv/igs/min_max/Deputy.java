package ua.lviv.igs.min_max;

import java.util.Scanner;

public class Deputy extends Person {

	private String surName;
	private String name;
	private int age;
	private boolean bribery;
	private int briberySize;

	public Deputy(int weight, int height, String gentlemanSet, String surName, String name, int age, boolean bribery) {
		super(weight, height, gentlemanSet);
		this.surName = surName;
		this.name = name;
		this.age = age;
		this.bribery = bribery;

	}
	

	public int getBriberySize() {
		return briberySize;
	}


	public void setBriberySize(int briberySize) {
		this.briberySize = briberySize;
	}


	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribery() {
		return bribery;
	}

	public void setBribery(boolean bribery) {
		this.bribery = bribery;
	}

	@SuppressWarnings("resource")
	@Override

	public void addBribery() {

		if (this.bribery == false) {
			System.out.println(" Цей депутат не бере хабарів");
		
		} else if (this.bribery == true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите сумму взятки:");
			int addBribery = sc.nextInt();

			if (addBribery >= 5000) {
				System.out.println(" Миліція увязнить депутата");
			} else {
				this.briberySize = addBribery;
			}
		}
	}

	@Override
	public String toString() {
		return "Deputy [surName=" + surName + ", name=" + name + ", age=" + age + ", bribery=" + bribery
				+ ", briberySize=" + briberySize + ", getWeight()=" + getWeight() + ", getHeight()=" + getHeight()
				+ ", getGentlemanSet()=" + getGentlemanSet() + "]";
	}

	public boolean isBribeTaker() {
		
		return false;
	}

}
