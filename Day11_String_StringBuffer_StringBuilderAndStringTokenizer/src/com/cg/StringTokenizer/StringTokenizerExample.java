package com.cg.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("JAVA:Code:String", ":",false);
		
		while(s.hasMoreElements())
		{
			System.out.println(s.nextToken());
		}

	}

}
