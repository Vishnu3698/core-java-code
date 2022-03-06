package com.capgemini;
class vd {
private String name,email;
private int mobno,dob,doj;
public void get()
{
	name="vd";
	email="rr@gmail.com";
}
public void get1() {
	mobno=65432100;
	dob=521998;
	doj=782020;
}
public void disp()
{
	System.out.println(name+" "+email);
System.out.println(mobno+" "+dob+" "+doj);
}
}
class employee
{
	public static void main(String abc[])
	{
	vd b=new vd();
		b.get();
		b.get1();
		b.disp();
	}
}
