package ua.lviv.igs.task_05;

public class Application {

	public static void main(String[] args) {
		
		Amphibia eat = () -> System.out.println("He eats");
		Amphibia sleep = () -> System.out.println("He sleeps");
		Amphibia swim = () -> System.out.println("He swims");
		Amphibia walk = () -> System.out.println("He walks");

		eat.voice();
		sleep.voice();
		swim.voice();
		walk.voice();

	}
	
	interface Amphibia{
		void voice();
	}

}
