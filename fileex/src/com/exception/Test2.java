package com.exception;

import java.io.FileReader;
import java.io.IOException;

public class Test2 
{
	public static void main(String[] args)
	{
		try {
		FileReader frd=new FileReader("D:\\jspiders123\\sample.txt");
		int x=frd.read();
		while(x!=-1)
		{
		System.out.print((char)x);
		x=frd.read();
	}
	}
catch(Exception e)
	{
	e.printStackTrace();
	}
}
}
