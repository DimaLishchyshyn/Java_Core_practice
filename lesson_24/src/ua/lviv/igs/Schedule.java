package ua.lviv.igs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;

public class Schedule {

	static Set<Seance> seances = new TreeSet<Seance>();

	@SuppressWarnings("static-access")
	public Schedule(TreeSet<Seance> seances) {
		super();
		this.seances = seances;
	}
	
	 static Supplier<Seance> createSeance = () -> {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ���������");
		String title = sc.next();
		System.out.println("������ ��� �������");
		System.out.println("������");
		int hour = sc.nextInt();
		System.out.println("�������");
		int min = sc.nextInt();
		
		try {
			return new Seance(new Movie(title),new Time(hour,min));
		} catch (TimeException e) {
			e.printStackTrace();
		}
		return null;
		
	};

	public TreeSet<Seance> getSeances() {
		return (TreeSet<Seance>) seances;
	}

	@SuppressWarnings("static-access")
	public void setSeances(TreeSet<Seance> seances) {
		this.seances = seances;
	}

	public static void addSeance() {
		Seance seance = createSeance.get();
		
		seances.add(seance);
		System.out.println("" + seance.toString() + " ������ ����������� �� ������");

	}

	void removeSeance() {

	}

	@Override
	public String toString() {
		return "Schedule [seances=" + seances + "]";
	}

}
