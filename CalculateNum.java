package com.shoeb.programs;
public class CalculateNum {

	public static void main(String[] args) {
        int n=5;
        System.out.println(calculateDifference(n));

	}

public static int calculateDifference(int n) {
	int sum1=0,sum2=0;
	int num=12345;
	while(num!=0) {
		int rem=num%10;
		sum1=sum1+rem;
		num=num/10;
	}
	System.out.println(sum1*2);
	
	for(int i=0;i<=n;i++) {
		sum2+=(i*i);
	}
	return sum2;
}

}
