package com.shoeb.programs;

public class PowerTwo {

	public static void main(String[] args) {
	
         System.out.println("8 is a power of two:"+checkNumber(8));
	}


public static boolean checkNumber(int n) {
	while(n%2==0) {
		n=n/2;
	}
	if(n==1) {
		return true;
	}
	else {
		return false;
	}
}
}