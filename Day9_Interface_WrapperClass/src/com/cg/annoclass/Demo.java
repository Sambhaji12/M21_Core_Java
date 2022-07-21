package com.cg.annoclass;
abstract class Annonymous 
{
	public abstract void method();
}
public class Demo {
	

	
	public static void main(String[] args) {
		Annonymous a=new Annonymous()
				{
				public void method()
					{
					System.out.println("This is example of annonymousclass:");
						}
				};
				a.method();
		

	}

}
