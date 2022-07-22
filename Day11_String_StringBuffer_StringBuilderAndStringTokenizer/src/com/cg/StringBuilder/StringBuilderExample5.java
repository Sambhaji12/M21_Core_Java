package com.cg.StringBuilder;

public class StringBuilderExample5 {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		
		System.out.println(s.capacity());
		s.append("boy");
		System.out.println(s.capacity());
		s.append("My nmae is sambhaji dhavne");
		System.out.println(s.capacity());



	}

}
