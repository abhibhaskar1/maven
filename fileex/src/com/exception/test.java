package com.exception;

import java.io.File;
import java.io.IOException;

public class test 
{
	public static void main(String[] args)
	{
		File f=new File("D:\\jspiders123\\sample.txt");
		boolean b=f.exists();
		if(b!=true)
		{
			try{
				boolean b1=f.createNewFile();
				if(b1==true)
				{
					System.out.println("file is created successfully!!!");
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}