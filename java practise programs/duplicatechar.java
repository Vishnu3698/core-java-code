package vd;

import java.util.Scanner;

public class duplicatechar {

	public static void main(String[] args) {
		String word=new String();
		System.out.println("enter word");
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		for(int i=0;i<in.length();i++) {
			for(int j=0;j<word.length();j++)
		{
				if(in.charAt(i)!=word.charAt(j))
				{
				word=word+in.charAt(i)	;
				}
		}
			
		}
		System.out.println(word);

	}

}
