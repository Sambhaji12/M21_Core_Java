package com.cg.Generic;
interface abc <t1,t2>
{
	 <t1> void display1(t1 x);
	 <t2> void display2(t2 y);
	
}
public class Generic_Interface implements abc {

	public static void main(String[] args) {
		
		Generic_Interface gi=new 	Generic_Interface();
		gi.display1(11);
		gi.display2(12);

	}

	@Override
	public void display1(Object x)
	{
		System.out.println("value of x is:"+x);
		
	}

	@Override
	public void display2(Object y) 
	{
		System.out.println("value of y is:"+y);
		
	}

}
