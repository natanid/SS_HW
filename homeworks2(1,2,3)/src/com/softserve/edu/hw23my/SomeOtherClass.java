package com.softserve.edu.hw23my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 У методі main (деякого іншого класу) сворити два об'єкти класів JuniorEmployee та SeniorEmployee.
 */

public class SomeOtherClass {

	public static void main(String[] args)
	{
		Employee[] employees = new Employee[4];
		employees[0] = new JuniorEmployee("JE1", 23, 1, 160);
		employees[1] = new JuniorEmployee("JE2", 25, 3, 152);
		employees[2] = new SeniorEmployee("SE1", 30, 8, 150);
		employees[3] = new SeniorEmployee("SE2", 32, 10, 170);
		
		
		for (Employee s: employees)
			System.out.println("Name: " + s.getName() + " Salary: " + s.getPayment());
	
		List<Employee> al = new ArrayList<Employee>() ;
		al.add( new JuniorEmployee("JE3", 23, 1, 160) ) ;
		al.add( new JuniorEmployee("JE2", 23, 1, 160) ) ;
		al.add( new JuniorEmployee("JE1", 23, 1, 160) ) ;
		
		al.add( new SeniorEmployee("SE3", 30, 8, 150) ) ;
		al.add( new SeniorEmployee("SE2", 30, 8, 150) ) ;
		al.add( new SeniorEmployee("SE1", 30, 8, 150) ) ;
		
		Collections.sort( al ) ;
	
		System.out.println( Arrays.toString( al.toArray() ) ) ;
	}
}
