package com.cg.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerexample3 {

	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("Lets,try,this,");
		
		while(s.hasMoreElements())
		{
			System.out.println(s.nextToken());
		}

	}

}
