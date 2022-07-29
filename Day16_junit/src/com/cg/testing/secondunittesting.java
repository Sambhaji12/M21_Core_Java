package com.cg.testing;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class secondunittesting {
	@Test
	@BeforeAll
	static void display()
	{
		System.out.println("before all excute before all the test method:");
	}
	@Test
	@BeforeEach
	void accept()
	{
		System.out.println("hey");
	}
	@Test
	
	void print()
	{
		System.out.println("hello guys:");
	}

}
