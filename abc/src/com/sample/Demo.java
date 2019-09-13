package com.sample;

public class Demo
{
public static void main(String[] args)
{
String s1=new String("qspiders");
char[] ch=s1.toCharArray();
int count=0;
for(int i=0;i<ch.length;i++)
{
if(ch[i]=='s')
count++;
}
System.out.println(count);
}
}