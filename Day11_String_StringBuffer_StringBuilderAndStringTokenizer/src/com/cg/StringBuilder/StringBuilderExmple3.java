package com.cg.StringBuilder;

public class StringBuilderExmple3 {

	public static void main(String[] args) {
		String str="Tomorrow"; 
		StringBuilder s=new StringBuilder(str.length());
		System.out.println(s.capacity());

	}

}
