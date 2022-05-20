package com.abstractclass;

public class Company extends Employee{
	
	private void companyId() {
		System.out.println("company id is 1234");
	}
	
	@Override
	public void empAadhar() {
		System.out.println("emp aadhar is 5678945678654");
	}
	public static void main(String[] args) {
		
		//Employee a = new Employee();  - NP
		
		Employee b = new Company();	//P
		b.empAadhar();
		b.empId();
		Company  c = new Company();
		c.empAadhar();
		c.empId();
		c.companyId();
		
		//Company d = new Employee();    - NP
		
		
		
	}

	

}
