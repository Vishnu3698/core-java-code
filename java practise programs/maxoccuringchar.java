package com.capgemini;
import java.util.*;
public class maxocustr {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String k=sc.nextLine();
		char tempArray[]=k.toCharArray();
		Arrays.sort(tempArray);
		String s=new String(tempArray);
		int n=s.length();
		int maxcount=0;
		int count=1;
		char ans ='-';
		for (int i=1;i<n;i++)
		{
			if ((i==n)||(s.charAt(i)!=s.charAt(i-1)))
			{
				if(maxcount <count)
				{
				maxcount=count;
				ans =s.charAt(i-1);
			}
			count=1;
			
			}
		else
		{
			count++;
		}}
	System.out.println("maximum occuring character is" +ans);
		

	}

}
