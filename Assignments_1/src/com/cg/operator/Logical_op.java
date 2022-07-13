package com.cg.operator;

import java.util.Scanner;

public class Logical_op {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=10;
		int b=10;
		
		
		if(a==b && b==a)
		{
			System.out.println("a and b have same values:");
		}else
		{
			System.out.println("a and b have  values:");	
		}

		
		if(a>b ||b>a)
		{
			System.out.println("True");
		}else
		{
			System.out.println("False");	
		}
		
		
		if(a!=b)
		{
			System.out.println("not equal");
		}
		else {
			System.out.println("equal");
		}
	}

}
