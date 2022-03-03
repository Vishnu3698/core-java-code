package vd;

import java.util.Scanner;

public class palindrome {
public static void main (String abc[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number");
	String reverse=" ";
	String num=sc.nextLine();
	int length = num.length();
	for(int i= length-1;i>=0;i--)
		reverse=reverse+num.charAt(i);
	if (num.equals(reverse))
		System.out.println("the entered no is a palindrome");
	else
		System.out.println("not a palindrome");
	
}
}
