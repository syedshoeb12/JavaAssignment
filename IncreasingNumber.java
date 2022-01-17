package com.shoeb.programs;
import java.util.Scanner;
public class IncreasingNumber {

	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
	
        int no = scan.nextInt();
        int cur =no%10;
        no = no/10;
        boolean state = true;
        while(no!=0){
            if(cur<no%10){
                state = false;
            }
            cur = no%10;
            no = no/10;
        }
        System.out.println(state);
		
	}
}	
		

