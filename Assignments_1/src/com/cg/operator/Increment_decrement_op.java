package com.cg.operator;

import java.util.Scanner;

public class Increment_decrement_op {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=10;
		a++;
		System.out.println("a++= "+a);
		
		a--;
		System.out.println("a--= "+a);
		
		++a;
		System.out.println("++a= "+a);
		
		--a;
		
		System.out.println("--a= "+a);

	}

}
