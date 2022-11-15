package com.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {

		if(e1.getId()>e2.getId())
			return -1;
		else if(e1.getId()<e2.getId())
			return 1;
		else

		
		return 0;
	}

}
