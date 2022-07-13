package com.cg.operator;

import java.util.Scanner;

public class Assignments_op {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of num1:");
		
		int num1=sc.nextInt() ;
		System.out.println("Enter the value of num2:");
		int num2=sc.nextInt() ;
		//1. (=) operator: 
		num1 =num2;
		System.out.println(	"num1:"+num1);
		
		//2. (+=) operator: 
		
		num1 += num2;
		  System.out.println("num1 = " + num1);
		  
		  //3.(-=) operator
		  
		   num1 -= num2;
		  System.out.println("num1 = " + num1);
		  
		  //3.(*=) operator
		  num1 *= num2;
		  System.out.println("num1 = " + num1);
		  
		  //3.(/=) operator
		  num1 /= num2;
		  System.out.println("num1 = " + num1);
		  
		  

	}

}
