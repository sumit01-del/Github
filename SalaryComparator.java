package com.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		
if(e1.getSalary()>e2.getSalary())
	
	return -1;
else if(e1.getSalary()<e2.getSalary())
	return 1;
else 
	return 0;
	}

}
