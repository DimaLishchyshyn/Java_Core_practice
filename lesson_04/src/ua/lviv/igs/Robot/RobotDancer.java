package ua.lviv.igs.Robot;

public class RobotDancer extends Robot {
	private String work;

	public RobotDancer(String name, String work, String work2) {
		super(name, work);
		work = work2;
	}

	public RobotDancer(String name) {
		super(name);
		work = " Ц € просто танцюю";
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
