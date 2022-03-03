package vd;

import java.util.Arrays;

public class PrintArrayElements {

	public static void main(String[] args) {

		String name[]= {"red","green","blue"};
	
		for(String i:name)
		{
			System.out.println(i);
		}
		System.out.println(Arrays.asList(name));
		System.out.println("By using to String methord"+Arrays.toString(name));
        Arrays.asList(name).stream().forEach(s->System.out.println("Using Stream"+s));
	}

}
