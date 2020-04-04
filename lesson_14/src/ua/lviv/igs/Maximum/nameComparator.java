package ua.lviv.igs.Maximum;

import java.util.Comparator;



public class nameComparator implements Comparator<Commodity>{

	
	public int compare(Commodity o1, Commodity o2) {
		if(o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		}else if(o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		}
		return 0;
	}

}
