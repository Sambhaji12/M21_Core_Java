package com.cg.abc;
abstract class A
{
	void Display()
	{
		System.out.println("This is non Abstract method:");
	}
}

class B extends A
{
	
}
public class NonAbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		b1.Display();
	}

}
