package com.cg.Arrays;

import java.util.Scanner;

public class TwoDUserInputArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the outside array size:");
		int m=sc.nextInt();
		
		System.out.println("Enter the inside array size:");
		int n=sc.nextInt();
		int arr[] []=new int [m][n];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		

	}

}
