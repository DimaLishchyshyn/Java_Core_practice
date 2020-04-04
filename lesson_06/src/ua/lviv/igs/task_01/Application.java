package ua.lviv.igs.task_01;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Працівник з фіксованою зарплатою:");
		Workermonth worker = new Workermonth(6000);
		System.out.println("Фіксована місячна зарплата працівника = " + worker + "грн.");

		worker.MySalary();
		System.out.println("Зарплата працівника за 6 місяців = " + worker + "грн.");

		System.out.println();
		
		System.out.println("Працівник з погодинною зарплатою:");
		Workerhour worker2 = new Workerhour(50);
		System.out.println("Погодинна зарплата працівника = " + worker2 + "грн.");

		worker2.MySalary();
		System.out.println("Погодинна зарплата працівника за 6 місяць = " + worker2 + "грн.");

	}

}
