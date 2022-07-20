package com.cg.thiskeyword;
class Main1
{
	int a;
	Main1()
	{
		this(10);
		System.out.println("default construtor:");
	}
	Main1(int a)
	{
		this.a=a;
		System.out.println("parameteried construtor:");
	}
}
public class Currentclassconstructor {

	public static void main(String[] args) {
	
		Main1 m=new Main1();
		
	}

}
