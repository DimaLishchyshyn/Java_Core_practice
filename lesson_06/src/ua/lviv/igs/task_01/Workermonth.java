package ua.lviv.igs.task_01;

public class Workermonth implements Salary{
	
	private int fixedSalary;

	public Workermonth(int fixedSalary) {
		super();
		this.setFixedSalary(fixedSalary);
	}

	public int getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(int fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	@Override
	public void MySalary() {
		int fixedSalary = getFixedSalary() * 6;
		setFixedSalary(fixedSalary);
		
	}

	@Override
	public String toString() {
		return "" + fixedSalary;
	}
	
	

}
