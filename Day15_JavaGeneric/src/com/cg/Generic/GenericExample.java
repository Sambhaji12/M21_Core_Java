package com.cg.Generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<Integer> ();
		
		obj.add(12);
		//obj.add("Str"); complie time checking : type safe
		
		System.out.println(obj);
		
		List<String> obj1=new LinkedList<String> ();
		obj1.add("shabnam");
		obj1.add("priya");
		
		String str=obj1.get(1);//type castong is not required
		System.out.println(str);
		
	}

}
