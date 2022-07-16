package com.cg.BufferReader;

import java.io.InputStreamReader;

public class BufferReader {

	public BufferReader(InputStreamReader inputStreamReader) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferReader Reader=new BufferReader(new InputStreamReader(System.in));
		String str=Reader.readLine();
		System.out.println(str);

	}

	private String readLine() {
		// TODO Auto-generated method stub
		return "I am a smart boys in zeal College of engineering :";
	}

}
