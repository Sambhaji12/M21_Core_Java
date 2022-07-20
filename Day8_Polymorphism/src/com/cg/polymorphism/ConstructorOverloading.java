package com.cg.polymorphism;
class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("renult king:");
	}
	Triber(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is::"+speed+"Engine is working on::"+engine);
	}
	
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Triber t1=new Triber();
		Triber t2=new Triber(24,"pethol");
		

	}

}
