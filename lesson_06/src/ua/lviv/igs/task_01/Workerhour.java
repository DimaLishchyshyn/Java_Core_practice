package ua.lviv.igs.task_01;

public class Workerhour {
	
	private int hourlyWages;

	public Workerhour(int hourlyWages) {
		super();
		this.setHourlyWages(hourlyWages);
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	public void MySalary() {
		int hourlyWages = getHourlyWages()*8*20*6;
		setHourlyWages(hourlyWages);
	}

	@Override
	public String toString() {
		return "" + hourlyWages;
	}

	

}
