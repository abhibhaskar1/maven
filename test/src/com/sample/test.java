package com.sample;
import java.io.File;
public class test 
{
	public static void main(String[] args)
	{
		File f=new File("D:\\jspiders123");
		boolean b=f.exists();
		if(b!=true)
		{
			boolean b1=f.mkdir();
			if(b1==true)
			{
				System.out.println("directory created successfully");
			}
		}
	}

}
