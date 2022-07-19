package com.cg.super_Keyword;


class Person
{
	void message()
	{
		System.out.println("This is the method from Person class:");
	}
}
class Man extends Person
{
	void println()
	{
		super.message();
		System.out.println("This is the method from man class:");
	}
	}

	public class SuperMethod {
		public static void main(String args[])
			{
			Man m=new Man();
			m.println();
			}

}
