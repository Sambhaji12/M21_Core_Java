package com.cg.thiskeyword;
//1.this keyword used to refer the instance of currentclass
class Fruit
{
	String str1;
	String str2;
	void display(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
	}
	void print()
	{
		System.out.println("First String is :"+str1);
		System.out.println("Second String is:"+str2);
	}
}
public class instanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit();
		f.display("lilly","Rose");
		f.print();

	}

}
