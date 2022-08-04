package com.cg.LambdaEx;

import java.io.File;
import java.io.FileFilter;

public class File_Filter_LambdaEx {

	public static void main(String[] args) {
		FileFilter obj=(File pathname) -> pathname.getName().endsWith(".txt");
		
		File file=new File(" \"C:\\Users\\sambhaji\\Downloads\\Telegram Desktop\"");
		
		File [] str=file.listFiles(obj);

		for(File i:str)
		{
			System.out.println(i);
		}
	}

}
