package com.cg.Interface;
interface bike
{
	void engine();
}

interface car extends  bike
{
	void speed();
}

class A1 implements car
{

	@Override
	public void engine() {
		System.out.println("Works on petrol::");
		
	}

	@Override
	public void speed() {
	System.out.println("40 per hours::");
		
	}
	
}
public class MainExample {

	public static void main(String[] args) {
			A1 a=new A1();
			a.engine();
			a.speed();

	}

}
