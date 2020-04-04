package ua.lviv.igs.min;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {

		Class<Person> c = Person.class;

		Constructor[] cons = c.getConstructors();
		printList("Constructor", cons);

		Method[] meths = c.getMethods();
		printList("Methods", meths);

		Field[] fields = c.getFields();
		printList("Fields", fields);

		Class<Person>[] interfaces = (Class<Person>[]) c.getInterfaces();
		printList("Interfaces", interfaces);

	}

	static void printList(String s, Object[] o) {
		System.out.println();
		System.out.println("------- " + s + " ------");

		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i].toString());
		}
	}

}
