package ua.lviv.igs.task_01_and_03;

@SuppressWarnings("serial")
public class MyException extends Exception{
	
	String massage;
	
	MyException(String massage){
		super(massage);
	}

}
