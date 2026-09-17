package com.sunbeam;

class ValueNotNegativeException extends Exception
{


	ValueNotNegativeException(String mesaage)
	{
		super(mesaage);
	}
}

public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	
	
	
	public Employee() {
		
	}


	public Employee(String firstName, String lastName, double salary) throws ValueNotNegativeException {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
		if(salary>0)
		{
			this.salary = salary;
		}
		else
		{
			 throw new ValueNotNegativeException("Salary must be positive");
		}
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if(salary >0)
		{
			this.salary = salary;
		}
		
	}
	
	public double yearlySal()
	{
		return this.salary*12;
	}
	
	
	
	
	

}
