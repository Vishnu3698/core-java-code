package vd;
import java.util.*;
class shopping {
	public void get()
	{
	String name;
	String description;
	int price;

	{
Scanner sc=new Scanner(System.in);
System.out.println("view description"+" "+"addtoshoppingbasket"+" "+"removefromshoppingbasket");
sc.next();
sc.next();
sc.nextInt();
}}}
class bm1 extends shopping
{
	public void get1()
	{
	int duration;
	int play,download;
	{
	
	super.get();
		Scanner sc=new Scanner(System.in);
	System.out.println("duration"+" "+"playdownload");
	sc.nextInt();
	sc.nextInt();
}}}
class bm2 extends bm1
{
	public void get2()
	{
		String author,noofpages;
		String previewcontent;
		
		{
	
	Scanner sc=new Scanner(System.in);
			System.out.println("authornoofpages"+" "+"previewcontent");
	sc.next();
	sc.next();
}}}


class vd
{
	public static void main (String abc[])
	{
		bm1 ss=new bm1();
		ss.get1();
		bm2 sv=new bm2();
		sv.get2();
	}}
