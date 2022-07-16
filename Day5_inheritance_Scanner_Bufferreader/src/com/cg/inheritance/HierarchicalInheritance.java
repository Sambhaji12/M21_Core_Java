package com.cg.inheritance;

// Program for HierarchicalInheritance

class MobileBrand
{
	void info()
	{
		System.out.println("MobileBrand is: ");
	}
}

class Samsung31 extends MobileBrand
{
	void info1()
	{
		System.out.println("MobileBrand is Samsung31 : ");
	}
}


class Samsung31s extends MobileBrand
{
	void info2()
	{
		System.out.println("MobileBrand is Samsung31s : ");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung31 s1=new Samsung31();
		s1.info();
		s1.info1();
		
		Samsung31s s2=new Samsung31s();
		s2.info();
		s2.info2();
		
	}

}
