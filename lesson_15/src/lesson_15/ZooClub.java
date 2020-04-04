package lesson_15;

import java.util.*;
import java.util.Map.Entry;

public class ZooClub {

	Map<Person, ArrayList<Animal>> zooClub = new HashMap<>();

	public void addPerson() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.next();
		System.out.println("Enter age");
		int age = scan.nextInt();

		Person p = new Person(name, age);
		zooClub.put(p, new ArrayList<Animal>());
	}

	public void addAnimal() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.next();
		System.out.println("Enter age");
		int age = scan.nextInt();

		if (isPersonExist(zooClub, name, age)) {
			System.out.println("Enter secies ");
			String species = scan.next();
			System.out.println("Enter name");
			String animalName = scan.next();
			Animal animal1 = new Animal(species, animalName);
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> nextPerson = iterator.next();
				if (nextPerson.getKey().getName().equalsIgnoreCase(name) && nextPerson.getKey().getAge() == age) {
					ArrayList<Animal> animalList = nextPerson.getValue();
					animalList.add(animal1);
					System.out.println(animal1.toString() + " was added");

				}
			}
		}
	}

	public void removeAnimal() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Person`s name ");
		String name = scan.next();
		System.out.println("Enter  age");
		int age = scan.nextInt();
		if (isPersonExist(zooClub, name, age)) {
			System.out.println("Enter species");
			String species = scan.next();
			System.out.println("Eneter age");
			String animalName = scan.next();
			if (isAnimalExist(zooClub, name, age, species, animalName)) {
				Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<Person, ArrayList<Animal>> nextPerson = iterator.next();
					if (nextPerson.getKey().getName().equalsIgnoreCase(name) && nextPerson.getKey().getAge() == age) {
						ArrayList<Animal> animalList = nextPerson.getValue();
						Iterator<Animal> iterator2 = animalList.iterator();
						while (iterator2.hasNext()) {
							Animal next = iterator2.next();
							if (next.getSpecies().equalsIgnoreCase(species)
									&& next.getName().equalsIgnoreCase(animalName)) {
								iterator2.remove();
								System.out.println(iterator2.toString() + " was deleted");
							}
						}
					}
				}
			} else {
				System.out.println("This animal dosen`t exist");
			}
		} else {
			System.out.println("This person doesen`t exist");
		}
	}

	public 	void removePerson() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.next();
		System.out.println("Enter age");
		int age = scan.nextInt();

		if (isPersonExist(zooClub, name, age)) {
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> nextPerson = iterator.next();
				if (nextPerson.getKey().getName().equalsIgnoreCase(name) && nextPerson.getKey().getAge() == age) {
					iterator.remove();
					System.out.println(nextPerson + " was deleted");
				}
			}
		} else {
			System.out.println("This person doesen`t exist");
		}
	}

	public void removeAnimalFromAllPerson() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter species");
		String species = scan.next();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> nextPerson = iterator.next();
			ArrayList<Animal> animalList = nextPerson.getValue();
			Iterator<Animal> iterator2 = animalList.iterator();
			while (iterator2.hasNext()) {
				Animal next = iterator2.next();
				if (next.getSpecies().equalsIgnoreCase(species)) {
					iterator2.remove();
					System.out.println(next.toString() + " was deleted from " + nextPerson.getKey());
				}
			}

		}
	}

	public void getZooClub() {
		Set<Entry<Person, ArrayList<Animal>>> zooClubPerson = zooClub.entrySet();
		for (Entry<Person, ArrayList<Animal>> enter : zooClubPerson) {
			System.out.println("Person " + enter.getKey() + " has " + enter.getValue());
		}
	}

	public 	boolean isPersonExist(Map<Person, ArrayList<Animal>> zooClub, String namePerson, int age) {
		boolean flag = false;
		Set<Entry<Person, ArrayList<Animal>>> zooClubPerson = zooClub.entrySet();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
		while (iterator.hasNext()) {
			@SuppressWarnings("unused")
			Entry<Person, ArrayList<Animal>> nextPerson = iterator.next();
			for (Entry<Person, ArrayList<Animal>> entry : zooClubPerson) {
				if (entry.getKey().getName().equalsIgnoreCase(namePerson) && entry.getKey().getAge() == age) {
					flag = true;
				}
			}
		}
		return flag;

	}

	public boolean isAnimalExist(Map<Person, ArrayList<Animal>> zooClub, String namePerson, int age, String species,
			String nameAnimal) {
		boolean flag = false;
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> nextPerson = iterator.next();
			if (nextPerson.getKey().getName().equalsIgnoreCase(namePerson) && nextPerson.getKey().getAge() == age) {
				ArrayList<Animal> list = nextPerson.getValue();
				Iterator<Animal> iteratorAnimal = list.iterator();
				while (iterator.hasNext()) {
					Animal next = iteratorAnimal.next();
					if (next.getSpecies().equalsIgnoreCase(species) && next.getName().equalsIgnoreCase(nameAnimal)) {
						flag = true;
					}
				}
			}
		}
		return flag;
	}
}
