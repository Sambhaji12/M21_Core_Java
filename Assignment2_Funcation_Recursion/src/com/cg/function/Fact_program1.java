package com.cg.function;

class Factorial1
{
	int n=5;
	int Fun(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else {
			return n*(Fun(n-1));
		}
		
		
		
	}
}
public class Fact_program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial1 fact=new Factorial1();
		System.out.println(fact.Fun(5));

	}

}
