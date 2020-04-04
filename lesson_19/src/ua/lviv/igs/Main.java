package ua.lviv.igs;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		Methods m = new Methods();
		File file = new File("serialization.txt");

		System.out.println();
		Employee e = new Employee("Anna", 121, 3450);
		System.out.println(e);

		System.out.println();
		m.serialize(file, e);
		System.out.println(m.deserialize(file));

		System.out.println();
		System.out.println("Collection");
		File fileCollection = new File("serializeCollection.txt");
		ArrayList<Employee> eCollection = new ArrayList<Employee>();
		eCollection.add(new Employee("Deedee", 25, 7));
		eCollection.add(new Employee("Adam", 28, 10));
		eCollection.add(new Employee("Kate", 34, 8));
		eCollection.add(new Employee("Andrue", 31, 22));
		eCollection.add(new Employee("Fabio", 19, 5));

		@SuppressWarnings("rawtypes")
		Iterator iterator = eCollection.iterator();
		while (iterator.hasNext()) {
			Employee next = (Employee) iterator.next();
			m.serialize(fileCollection, next);
			System.out.println(m.deserialize(fileCollection));
		}
	}

}
