package com.shoeb.programs;
import java.util.*;
public class SecondSmallest {

	public static void main(String[] args) {
		int a[]= {5,6,7,3,2,3,9};
		System.out.println("Second Smallest:"+getSecondSmallest(a,7));

	}
	
public static int getSecondSmallest(int []a,int total) {
	Arrays.sort(a);
	return a[1];
}
}
