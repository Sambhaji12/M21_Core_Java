package com.cg.para;
class B{
	public int roll_no;
	 public String name;
	
	B(String Name,int roll)
	{
		roll_no=roll;
	name=Name;
	
	
	}
	
		void data()
		{
			System.out.println("name is: "+name);
			System.out.println("name is: "+name);
		}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B("Sambhaji",12);
		b1.data();
	}

}
