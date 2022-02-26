

import java.util.Scanner;

 class user {

	private int rollno,marks;
	public void std()
	{
	
		Scanner sc =new Scanner(System.in);
		
		rollno=sc.nextInt();
		System.out.println("enter the roll no of student");
		marks=sc.nextInt();
		System.out.println("enter  the marks of student");
			
		}
		public void disp()
		{
			System.out.println("enter the rollno of student "+" "+"enter the marks of student");
			

	}

}
class student
{
	public static void main(String abc[])
	{
		user ss =new user();
		ss.std();
		ss.disp();
	}
	}

