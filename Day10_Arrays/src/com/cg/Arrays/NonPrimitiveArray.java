package com.cg.Arrays;
class Student
{
	public int roll;
	public String name;
	
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
}

public class NonPrimitiveArray {
	
	
	public static void main(String[] args) {
		Student arr[]=new Student[3];
		
		arr[0]=new Student(11,"sambhaji");

		arr[1]=new Student(12,"Ram");

		arr[2]=new Student(13,"XYZ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].roll+" "+arr[i].name);
		}
	}

}
