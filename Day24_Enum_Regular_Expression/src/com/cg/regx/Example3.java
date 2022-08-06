package com.cg.regx;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str= "M21_- sabnam";
	
		
		
		String[] res=str.split("-")	;	
		
		for(String i:res)
		{
			System.out.println(i);
		}
		

	}

}
