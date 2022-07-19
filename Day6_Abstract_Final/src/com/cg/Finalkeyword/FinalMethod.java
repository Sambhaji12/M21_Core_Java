package com.cg.Finalkeyword;

class Bike
{
	final void run()
	{
		System.out.println("This is the final method:");
	}
}
public class FinalMethod extends Bike {
	/*void run()
	{
		System.out.println("Final method from the inheritaned class:");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethod Honda=new FinalMethod();
		Honda.run();

	}

}
