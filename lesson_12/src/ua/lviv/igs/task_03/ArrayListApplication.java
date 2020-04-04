package ua.lviv.igs.task_03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApplication {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		/*create ArrayList*/
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		
		/*add with ArrayList*/
		list.add(1); 
		list.add("BOOM");
		list.add(3);
		list.add(4);
		list.add("BOOM");
		list.add(6);
		list.add(7);
		list.add("BOOM");
		list.add(9);
		
		System.out.println(list);
		
		/*remove index ArrayList*/
		list.remove(1);
		list.remove(3);
		list.remove("BOOM");
		
		System.out.println(list);
	}
}
