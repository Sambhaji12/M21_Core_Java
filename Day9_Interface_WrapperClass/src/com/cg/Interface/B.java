package com.cg.Interface;

public class B implements A{
	
	public void PrintMessage()  
	{
		System.out.println("PrintMessage");
		
	}
	
	
	public static void main(String[] args) {
		A b=new B();
		b.PrintMessage();

	}

	
	

}
