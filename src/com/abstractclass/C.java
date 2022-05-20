package com.abstractclass;

public class C  {

	C(){
		System.out.println("constructor");
	}
	
	static {
		System.out.println("static");
	}
	
	{
		System.out.println("instance");
	}
	
	public static void main(String[] args) {
		 new C();
		
	}

}
