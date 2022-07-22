package com.cg.Arrays;

import java.util.Scanner;

public class RuntimeArray {

	

	public static void main(String[] args) {
		int Size = 0;
		int[] arr=new int[Size];
		Scanner sc=new Scanner(System.in);
		 Size=sc.nextInt();
		System.out.println("Enter the elements::");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		

	}

}
