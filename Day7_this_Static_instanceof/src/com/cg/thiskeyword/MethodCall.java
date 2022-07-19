package com.cg.thiskeyword;
// This can be used as argument in method call:
class B
{
	void print(B b)
	{
		System.out.println("this is passed:");
	}
	void display()
	{
		print(this);
	}
}
public class MethodCall {

	public static void main(String[] args) {
	
		B b=new B();
		b.display();
		

	}

}
