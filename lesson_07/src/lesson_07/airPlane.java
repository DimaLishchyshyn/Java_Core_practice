package lesson_07;

public abstract class airPlane implements Info {

	int width;
	int length;
	int weight;
	int time = (int) (Math.random() * ((88 - 20) + 1)) + 20;
	double km = (double) (Math.random() * ((1000 - 0) + 1)) + 0;

	public airPlane(int weight, int width, int length) {
		super();
		this.width = width;
		this.length = length;
		this.weight = weight;
	}

	public void startMotors() {
		System.out.println("��������� �� ������ ���������� ����� " + time + "��.");
	}

	public void takeoffAirplane() {
		System.out.println("ʳ������ �������� �� ���������� � ����� " + km + "��.");
	}

	public void landingAirplane() {
		System.out.println("˳��� ��� �� �������");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeaght() {
		return weight;
	}

	public void setWeaght(int weaght) {
		this.weight = weaght;
	}

	@Override
	public String toString() {
		return " ���� = " + weight + "��. ������� = " + width + "�. ������ = " + length + "�";
	}

}
