package com.shoeb.programs;

public class CalculateSum {

	public static void main(String[] args) {
		int i,num=100,sum=0;
		for(i=1;i<=num;++i) {
			sum=sum+i;
		}
		System.out.println("sum of first 100 natural number="+sum);
		System.out.println();
		
		for(num=1;num<=100;num++) {
			if((num%3==0)||(num%5==0)) {
				System.out.println(num);
			}
		}	

	}

}
