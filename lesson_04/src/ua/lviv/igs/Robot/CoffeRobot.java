package ua.lviv.igs.Robot;

public class CoffeRobot extends Robot {

	private String work;

	public CoffeRobot(String name, String work, String work2) {
		super(name, work);
		work = work2;
	}

	public CoffeRobot(String name) {
		super(name);
		work = " Ц € варю каву";
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String toString() {
		return "я " + getName() + work;
	}

}
