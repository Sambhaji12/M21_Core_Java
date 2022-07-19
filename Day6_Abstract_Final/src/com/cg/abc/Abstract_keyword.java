package com.cg.abc;
abstract class Fruit
{
	abstract void display(); 
}


class Apple 
{
	void display()
	{
		System.out.println("This is Apple class:");
	}
	
}
public class Abstract_keyword {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.display();

	}

}
