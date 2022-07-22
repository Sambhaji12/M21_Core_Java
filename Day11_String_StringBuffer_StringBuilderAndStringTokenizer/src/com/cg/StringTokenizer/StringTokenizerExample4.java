package com.cg.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample4 {

	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("JAVA:Code:String", ":",true);
		
		while(s.hasMoreElements())
		{
			System.out.println(s.nextToken());
		}
	}

}
