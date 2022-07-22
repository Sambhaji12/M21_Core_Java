package com.cg.StringBuffer;

public class StringBufferExample5 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("jeva");
		System.out.println(s);
		System.out.println(s.charAt(1));
		
		s.setCharAt(1, 'a');
		System.out.println(s);
		System.out.println(s.charAt(1));
		


	}

}
