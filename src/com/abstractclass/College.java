package com.abstractclass;

public class College implements Industry{

	@Override
	public void industryId() {
		System.out.println("industry id is 2345");
	}
	
	public void collegeId() {
		System.out.println("college id is 45678");
	}
	
	public static void main(String[] args) {
		
		//Industry a = new Industry();  -NP
		//College b = new Industry(); -NP
		Industry c= new College();
		c.industryId();
		
		College d = new College();
		d.collegeId();
		d.industryId();
		
	}
	

}
