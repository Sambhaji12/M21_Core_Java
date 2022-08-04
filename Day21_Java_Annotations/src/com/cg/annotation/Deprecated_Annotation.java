package com.cg.annotation;
class xyz
{
	// it allow any method no longer to use
	@Deprecated 
	void print()
	{
		System.out.println("print method:");
	}
}
public class Deprecated_Annotation {

	public static void main(String[] args) {
		xyz x=new xyz();
		x.print();
		

	}

}
