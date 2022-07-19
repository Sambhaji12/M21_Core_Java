package com.cg.thiskeyword;
//2.This keyword can be used to access  arguments in construtor 
class A
{
	public  int a;
	A()
	{
		
	}
	A(int a)
	{
		this.a=a;
	}
}
public class ConstrutorArgument {

	public static void main(String[] args) {
	A obj=new A(8);
	System.out.println(+obj.a);

	}

}
