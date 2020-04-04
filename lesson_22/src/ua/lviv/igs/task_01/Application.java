package ua.lviv.igs.task_01;

public class Application {
	public static void main(String[] args) {
		
		cat cat = () -> System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
		dog dog = () -> System.out.println("ί οερ- Γΰσσσ-Γΰσσσ");
		cow cow = () -> System.out.println("ί κξπξβΰ- Μσσσ-Μσσσ");

		cat.voice();
		dog.voice();
		cow.voice();

	}
	
	interface cat{
		void voice();
	}
	interface dog{
		void voice();
	}
	interface cow{
		void voice();
	}

}
