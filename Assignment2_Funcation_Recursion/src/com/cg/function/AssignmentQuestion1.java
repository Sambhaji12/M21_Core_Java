package com.cg.function;

public class AssignmentQuestion1 {
	
	static int FindSum(int number)
	{
		
		return number == 0 ? 0: number %10 + FindSum(number /10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=120;
					System.out.println(FindSum(number));
	}

}
