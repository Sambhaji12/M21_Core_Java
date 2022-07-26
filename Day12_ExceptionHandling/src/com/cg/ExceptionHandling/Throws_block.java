package com.cg.ExceptionHandling;
// the java throws keyword used to declare an exception::
import java.io.IOException;
import java.rmi.AccessException;

public class Throws_block {
	public static	void display(int x)throws IOException,ClassNotFoundException
	{
		if(x==5)
		{
			throw new IOException("Input output exception");
		}
		else
			
		{
			throw new ClassNotFoundException("class not found  exception");	
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try
		{
			display(5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
