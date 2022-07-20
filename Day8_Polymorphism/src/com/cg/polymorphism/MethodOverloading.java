package com.cg.polymorphism;
//By changing the number of arguments::
class Shape
{
	int Area(int a)
	{
		return a*a;
	}
	
	int Area(int a,int b)
	{
		
		return a*b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		System.out.println(s.Area(5));
		System.out.println(s.Area(10,20));

	}

}
