package com.abstractclass;

public class D extends College implements A, B{

	@Override
	public void b() {
		System.out.println("b");
	}

	@Override
	public void a() {
		System.out.println("a");
	}
	
	public static void main(String[] args) {
		
		D obj = new D();
		obj.b();
		obj.a();
		obj.collegeId();
		
	}

}
