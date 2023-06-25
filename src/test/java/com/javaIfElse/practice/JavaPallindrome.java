package com.javaIfElse.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaPallindrome {
	
	

	public static void main(String[] args) {
	List<Integer> myList = new ArrayList<>();
	//add()=single & addAll()=Array.asList() & List & Set
	myList.add(4);
	myList.add(2);
	myList.add(6);
	//max & min ==> List (class =Collections[method =static])
	int maxValue=Collections.max(myList);
	
	System.out.println("**************");
	System.out.println("Max number = "+maxValue);
	System.out.println("=============");
	
	
	//2nd max & 2nd min= multiple ways
	System.out.println("Before sorting = "+myList);
	Collections.sort(myList);
	System.out.println("After sorting = "+myList);
	Collections.reverse(myList);
	System.out.println("Desc sorting = "+myList);
	
	System.out.println("Second max = "+myList.get(1));
	
	}
	
}
