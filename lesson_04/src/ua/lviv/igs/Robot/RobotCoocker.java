package ua.lviv.igs.Robot;

public class RobotCoocker extends Robot {
	private String work;

	public RobotCoocker(String name, String work, String work2) {
		super(name, work);
		work = work2;
	}

	public RobotCoocker(String name) {
		super(name);
		work = " Ц € просто готую";
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
