package com.cg.super_Keyword;
class Flower
{
	Flower(String str)
	{
		System.out.println("Flower is: "+str);
	}
}

class Rose extends Flower
{

	Rose(String str) {
		super(str);
		// TODO Auto-generated constructor stub
		
	}
	
}
public class SuperConstructor {

	public static void main(String[] args) {
		
		Flower f=new Flower("rose");
	

	}

}
