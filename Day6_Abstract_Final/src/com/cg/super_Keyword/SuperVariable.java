package com.cg.super_Keyword;
// Super keyword used to access the parent class instance variable:

class Mobile
{
	String str="red";
}
class Sumsang extends  Mobile
{
	String str="black";
	void display()
	{
		System.out.println("color is:"+str);
		System.out.println("color is:"+super.str);
		
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sumsang s=new Sumsang();
		s.display();

	}

}
