package ua.lviv.igs.Maximum;

public class Commodity implements Comparable<Commodity>{
	
	private String name;
	private int length;
	private int width;
	private int weaght;
	
	public Commodity(String name, int length, int width, int weaght) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weaght = weaght;
	}
	
	public Commodity(String name) {
		super();
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeaght() {
		return weaght;
	}
	public void setWeaght(int weaght) {
		this.weaght = weaght;
	}
	@Override
	public String toString() {
		return "Товар назва=" + name + ", довжина=" + length + ", ширина=" + width + ", вага=" + weaght + "клг";
	}
	@Override
	public int compareTo(Commodity arg0) {
		
		return 0;
	}
	
	

}
