package com.cg.operator;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.println(" ");
			}
			space--;
			for(int j=1;j<=i;j++)
			{
				System.out.println("*");
			}
			
		}
	}

}
