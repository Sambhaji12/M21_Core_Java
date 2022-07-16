package com.cg.function;
class Factorial
{
int Fact(int n)
{
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		 fact=fact*i;
	}
	return fact;
}
}
public class Fact_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fact=new Factorial();
		System.out.println(fact.Fact(5));
		
	}

}
