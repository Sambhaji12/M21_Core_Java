package com.cg.Interface;

interface Inf
{
	void display();
}
/**
 * @author sambhaji
 *
 */
/**
 * @author sambhaji
 *
 */
public class main implements Inf{

	public static void main(String[] args) {
		main m=new main();
		m.display();
		System.out.println("helloo");

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is the method from interface::");
		
	}

}
