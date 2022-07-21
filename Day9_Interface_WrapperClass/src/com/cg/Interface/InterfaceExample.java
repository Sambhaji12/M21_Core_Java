package com.cg.Interface;
interface FirstInterface
{
	public void FirstMethod();
	
}

interface SecondInterface extends FirstInterface
{
	void secondMethod();
}
class Demo implements FirstInterface,SecondInterface
{

	@Override
	public void secondMethod() {
		System.out.println("This is the SecondMethod::");
		
	}

	@Override
	public void FirstMethod() {
		System.out.println("This is the FirstMethod::");
		
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.FirstMethod();
		d.secondMethod();

	}

}
