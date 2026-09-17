package com.sunbeam;

public class EmployeeTest {

	public static void main(String[] args) {
		
		 
		try {
			
			Employee e1 = new Employee("Tushar","Bhilare",-1);
			System.out.println("Yearly Salary :"+e1.yearlySal());
			System.out.println("Hike :"+e1.yearlySal() *1.1);
			
		} catch (ValueNotNegativeException e) {
			
			e.printStackTrace();
		}
		
		Employee e2;
		try {
			e2 = new Employee("Omkar","yadav",-1);
			System.out.println("Yearly Salary :"+e2.yearlySal());
			System.out.println("Hike :"+e2.yearlySal() *1.1);
		} catch (ValueNotNegativeException e) {
			
			e.printStackTrace();
		}
		
	
		

	}

}
