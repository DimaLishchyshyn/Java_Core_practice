package ua.lviv.igs.task_01;

public class Application {
	public static void main(String[] args) {
		
		cat cat = () -> System.out.println("� ��- �����-�����");
		dog dog = () -> System.out.println("� ���- �����-�����");
		cow cow = () -> System.out.println("� ������- ����-����");

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
