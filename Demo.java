package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList<Emp> a=new ArrayList<>();
		a.add(new Emp(12,"sam",4000));
		a.add(new Emp(10,"ABHIJIT",2000));
		a.add(new Emp(1,"GORam",28000));
		a.add(new Emp(4,"Ram",21000));
System.out.println(a);
		Collections.sort(a,new IdComparator());
		System.out.println(a);
		
		
	}

}
