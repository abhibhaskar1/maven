package com.rev;

public class Rev 
{
	public static void main(String[] args)
	{
		String s="royal enfield is not a sports bike";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
