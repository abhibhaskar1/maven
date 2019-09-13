package com.encap;

public class phone 
{
private String brand;
public phone()
{
	System.out.println("phone object created");
}
public String getbrand()
{
return brand;
}
public void setbrand()
{
this.brand=brand;
}
public class main
{
public static void main(String[] args)
{
phone p=new phone();
p.setbrand("sony");
String brand=p.getbrand();
System.out.println("phone brand is" +brand);
}
}
}
