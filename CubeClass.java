package com.shoeb.programs;
import java.util.Scanner;
public class CubeClass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("INPUT:");
		int number = scan.nextInt();
	    int sum=0;
	    
		while(number!=0){
		    int digit=number%10;
		    sum=sum+(int)Math.pow(digit, 3);
		    number = number/10;
		  
		}
		System.out.println("Output:Sum of digits cube="+sum);

	}

}
