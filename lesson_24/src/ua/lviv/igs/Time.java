package ua.lviv.igs;

public class Time {

	private int min;
	private int hour;
	

	public Time(int hour, int min) throws TimeException {
		super();
		if (min < 0 || min >= 60) throw new TimeException("0...60");
		if (hour < 0 || hour >= 24) throw new TimeException("0...24");
		this.min = min;
		this.hour = hour;

	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return hour + ":" + min;
	}
	
	
}


class TimeException extends Exception {

	String massage;

	TimeException(String massage) {
		super(massage);
	}

}
