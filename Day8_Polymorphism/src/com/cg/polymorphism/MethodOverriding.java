package com.cg.polymorphism;
class Multplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
}
class Mult extends Multplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Mult m=new Mult();
		m.accept(12,3);
		Multplication m1=new Multplication();
		m1.accept(5, 8);
				
	}

}
