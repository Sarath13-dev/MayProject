package com.interfacee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Customers {
	
	private int add(int a, int b) {
		//300
		System.out.println(a+b);
		//600
		return 2*(a+b);
	}
	//600
	private int multiply(int a) {
		//3000
		return a*5;
	}
	
	
	public static void main(String[] args) {
		Customers obj = new Customers();
		int add = obj.add(100, 200);
		int multiply = obj.multiply(add);
		System.out.println(multiply);
		List li = new ArrayList();
		System.out.println(li);
		int add2 = obj.add(100, 200);
	}
	
}
