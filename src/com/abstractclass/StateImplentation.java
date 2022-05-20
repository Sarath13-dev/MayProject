package com.abstractclass;

public class StateImplentation extends State {
	
	@Override
	public void stateDetails(String name) {
		System.out.println("after overided");
		System.out.println("state name is "+ name);
		super.stateDetails("Tamil nadu");
	}
	
	@Override
	public void stateDetails(int noOfDistricts, String governerName, String touristSpot) {
		System.out.println("after overided");
		System.out.println("state governer name is "+ governerName +"\n"+"state tourist spot is "+ touristSpot+"\t"+"state district count is "+ noOfDistricts);
		super.stateDetails(32, "Ravi", "ooty");
	}
	
	@Override
	public void stateDetails(String cmname, String headquaters, int pincode) {
		System.out.println("after overided");
		System.out.println("state cm name is "+ cmname +"\n"+"state head quaters is "+ headquaters+"\t"+"state pin code is "+ pincode);
		super.stateDetails("Stalin", "Chennai", 600);
	}
	
	public static void main(String[] args) {
		
		StateImplentation a = new StateImplentation();//only overided methods
		a.stateDetails("Kerala");
		a.stateDetails(18, "H Raja", "vayanad");
		a.stateDetails("Vijayan", "Trivandram", 500);
		
	}

}
