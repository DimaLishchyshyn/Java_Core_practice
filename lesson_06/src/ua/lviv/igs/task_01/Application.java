package ua.lviv.igs.task_01;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("��������� � ���������� ���������:");
		Workermonth worker = new Workermonth(6000);
		System.out.println("Գ������� ������ �������� ���������� = " + worker + "���.");

		worker.MySalary();
		System.out.println("�������� ���������� �� 6 ������ = " + worker + "���.");

		System.out.println();
		
		System.out.println("��������� � ���������� ���������:");
		Workerhour worker2 = new Workerhour(50);
		System.out.println("��������� �������� ���������� = " + worker2 + "���.");

		worker2.MySalary();
		System.out.println("��������� �������� ���������� �� 6 ����� = " + worker2 + "���.");

	}

}
