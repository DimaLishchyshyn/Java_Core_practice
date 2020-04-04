package ua.iviv.igs.Car;

public class Helm extends Car{
	
	public int size;

	
	public Helm(int size) {
		super();
		this.size = size/2;
	
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	
	public String toString() {
		return  "" + size+"см";
	}
	

	
	

}
