package ua.iviv.igs.Car;

public class Car {
	private String car;
	private String model;
	private String color;
	private Body body;
	private Helm helm;
	private Wheel wheel;

	public Car(String car, String model, String color, Body body, Helm helm, Wheel wheel) {
		super();
		this.car = car;
		this.model = model;
		this.color = color;
		this.helm = helm;
		this.body = body;
		this.wheel = wheel;
		
	}

	public Car() {
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Марка машини = "+ car +", Модель = " + model + ", Колір = " + color + ", Кузов(потужність) = "
	+ body + ", Руль(розмір) = " + helm + ", Колесо(діаметр) = " + wheel;
	}
	
	

}
