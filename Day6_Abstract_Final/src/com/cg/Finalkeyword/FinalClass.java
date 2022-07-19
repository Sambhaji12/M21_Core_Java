package com.cg.Finalkeyword;


// if we try to extends the final class then error occurred
final class A
{
	void run()
	{
		System.out.println("The method from final class:");
	}
}
public class FinalClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.run();
	}

}
