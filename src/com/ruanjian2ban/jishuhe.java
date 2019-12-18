package com.ruanjian2ban;

public class jishuhe {
	
	public static void main(String[] args) {
		//for循环
		int sum=0;
		for(int i=1;i<100;i+=2) {
			sum=sum+i;
		}
		System.out.println("100以内奇数和是"+sum);
		//while
		sum=0;
		int i=2;
		while(i<=100) {
			sum=sum+i;
			i+=2;
		}
		System.out.println("100以内偶数和是"+sum);
	}
}
