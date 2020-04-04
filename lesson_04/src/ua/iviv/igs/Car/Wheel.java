package ua.iviv.igs.Car;

public class Wheel extends Car{
	
	public int diametr;
	
	public Wheel(int diametr) {
		super();
		this.diametr = (diametr+50)/2;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	
	public String toString() {
		return "" + diametr+"см";
	}
	

	

	

}
