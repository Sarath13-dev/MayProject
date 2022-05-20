package com.abstractclass;

public class FacebookLoginPage {
	
	public static void main(String[] args) {
		
		Facebook a = new Facebook();
		a.setUsername("RamSarath");
		a.setPassword(123);
		String username = a.getUsername();
		int password = a.getPassword();
		
		String output = a.output(username, password);
		System.out.println(output);
		
		Facebook b = new Facebook();
		b.setUsername("Anand");
		b.setPassword(678);
		
		System.out.println(b.output(b.getUsername(), b.getPassword()));
		
		Facebook c = new Facebook();
		c.setUsername("Babu");
		c.setPassword(567);
		
		System.out.println(c.output(c.getUsername(), c.getPassword()));
	}

}
