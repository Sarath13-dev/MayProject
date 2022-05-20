package com.abstractclass;

public class State {
	
	public void stateDetails(String name) {
		System.out.println("state name is "+ name);
	}

	public void stateDetails(String cmname, String headquaters, int pincode) {
		System.out.println("state cm name is "+ cmname +"\n"+"state head quaters is "+ headquaters+"\t"+"state pin code is "+ pincode);
	}
	
	
	public void stateDetails(int noOfDistricts, String governerName, String touristSpot) {
		System.out.println("state governer name is "+ governerName +"\n"+"state tourist spot is "+ touristSpot+"\t"+"state district count is "+ noOfDistricts);
	}
	
	public static void main(String[] args) {
		
		State a = new State();
		a.stateDetails("Stalin","Chennai",600);
		a.stateDetails(32,"Ravi","Ooty");
		a.stateDetails("Tamil Nadu");
		
	}
	
	

}
