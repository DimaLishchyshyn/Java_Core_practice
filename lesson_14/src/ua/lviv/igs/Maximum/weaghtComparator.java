package ua.lviv.igs.Maximum;

import java.util.Comparator;

public class weaghtComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if(o1.getWeaght()>(o2.getWeaght())) {
			return 1;
		}else if(o1.getWeaght()<(o2.getWeaght())) {
			return -1;
		}
		return 0;
	}

}
