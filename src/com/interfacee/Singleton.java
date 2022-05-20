package com.interfacee;

public class Singleton {
	
	static Singleton a;				//a - null, m[a]=0		//a-object, m[a]=12345
	
	private static Singleton getObject() {//a - null, m[a]=0
		if(a==null) {				//a -null, m[a]=0
			a = new Singleton();	//a-objcet, m[a]=12345
		}
		return a;
	}
	
	private void empId() {
		System.out.println("emp id is 1234");
	}
	
	public static void main(String[] args) {
	Singleton object = getObject();
	System.out.println(System.identityHashCode(object));
	object.empId();
	Singleton object2 = getObject();
	System.out.println(System.identityHashCode(object2));
	}

}
