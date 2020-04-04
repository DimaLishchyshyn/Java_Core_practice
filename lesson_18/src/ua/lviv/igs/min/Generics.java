package ua.lviv.igs.min;

public class Generics<T, V> {

	T ob1;
	V ob2;
	public Generics(T ob1, V ob2) {
		super();
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	public T getOb1() {
		return ob1;
	}
	public void setOb1(T ob1) {
		this.ob1 = ob1;
	}
	public V getOb2() {
		return ob2;
	}
	public void setOb2(V ob2) {
		this.ob2 = ob2;
	}
	@Override
	public String toString() {
		return "Integer = " + ob1 + ", List<Integer> = " + ob2;
	}

	

}
