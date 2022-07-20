package com.cg.thiskeyword;
class  Main
{
	int a;
	int b;
	Main()
	{
		a=10;
		b=20;
	}
	
	Main get()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("a ="+a + "b="+b);
	}
}
public class currentclassinstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main object =new Main();
		object.get().display();

	}
	

}
