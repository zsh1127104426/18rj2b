package com.ruanjian2ban;

public class Fibonacci {
	//课本第三章103页编程题最后一个
	//裴波那契数列
	public static int f(int n) {
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		System.out.println("裴波那契数列第n个数的数值"+f(10));

	}

}
