package ua.lviv.igs.Minimum_Sorting;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Person> setPerson = new HashSet<>();

		setPerson.add(new Person("Persi", 25));
		setPerson.add(new Person("Anna", 42));
		setPerson.add(new Person("Romeo", 35));
		setPerson.add(new Person("Wika", 28));
		setPerson.add(new Person("Kate", 11));
		setPerson.add(new Person("Brava", 53));
		setPerson.add(new Person("Sander", 87));
		setPerson.add(new Person("Deedee", 54));
		setPerson.add(new Person("Mila", 31));

		System.out.println("Default sorting");
		for (Person person : setPerson) {
			System.out.println(person);
		}
		
TreeSet<Person> setPerson1 = new TreeSet<>();
		
		setPerson1.add(new Person("Persi", 25));
		setPerson1.add(new Person("Anna", 42));
		setPerson1.add(new Person("Romeo", 35));
		setPerson1.add(new Person("Wika", 28));
		setPerson1.add(new Person("Kate", 11));
		setPerson1.add(new Person("Brava", 53));
		setPerson1.add(new Person("Sander", 87));
		setPerson1.add(new Person("Deedee", 54));
		setPerson1.add(new Person("Mila", 31));
		
		System.out.println();
		System.out.println("Comparable sorting <name>");
		for (Person person : setPerson1) {
			System.out.println(person);
		}
		
		TreeSet<Person> setPerson2 = new TreeSet<>(new SortingComparator());
		
		setPerson2.add(new Person("Persi", 25));
		setPerson2.add(new Person("Anna", 42));
		setPerson2.add(new Person("Romeo", 35));
		setPerson2.add(new Person("Wika", 28));
		setPerson2.add(new Person("Kate", 11));
		setPerson2.add(new Person("Brava", 53));
		setPerson2.add(new Person("Sander", 87));
		setPerson2.add(new Person("Deedee", 54));
		setPerson2.add(new Person("Mila", 31));
		
		System.out.println();
		System.out.println("Comparator sorting <age>");
		for (Person person : setPerson2) {
			System.out.println(person);
		}

	}

}
