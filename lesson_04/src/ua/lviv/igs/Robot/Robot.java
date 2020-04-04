package ua.lviv.igs.Robot;

public class Robot {

	private String name;
	private String work = " Ц € просто працюю";

	public Robot(String name, String work) {
		super();
		this.name = name;
		this.work = work;
	}

	public Robot(String name) {
		super();
		this.name = name;
		this.work = " Ц € просто працюю";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String toString() {
		return "я " + name + "" + work;
	}

}
