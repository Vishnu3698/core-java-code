package com.capgemini;
public class unsortedarrays {



public static void main(String[] args)
{
int arrayA[]= {0};
int arrayB[]= {5,6,4,5};
int A=arrayA.length;
int B=arrayB.length;
int mergeArray[]= new int[A + B];
System.arraycopy(arrayA, 0, mergeArray, 0, A);
System.arraycopy(arrayB, 0, mergeArray, 0, B);
System.out.println("arrays.toString(mergeArray");

}



}
