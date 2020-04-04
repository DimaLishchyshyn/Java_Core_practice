package ua.lviv.igs;

import java.lang.reflect.Field;
import java.time.LocalDate;;

public class ApplicationInformation {

	public static void main(String[] args) {

		getInformation(Person.class);

		LocalDate today = LocalDate.now();
		System.out.println();
		System.out.print("toDay: "+today);

	}

	private static void getInformation(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();
		

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(Info.class) instanceof Info) {
				System.out.print(field.getName() + " ---> ");
				System.out.println(field.getAnnotation(Info.class).parameters());
			}
		}

	}

}
