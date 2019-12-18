package com.ruanjian2ban;

public class Recursive {
	//求和递归方法：在方法的内部调用方法自己，叫做方法的递归
	public static int getSum(int n) {
		if(n==1) {
			return 1;
		}
		int temp=getSum(n-1);
		return temp+n;
	}
	//getSum(4)10 temp=getSum(3)=6 temp+4
	//getSum(3)6 temp=getSum(2)=3 temp+3
	//getSum(2)3 temp=getSum(1)=2 temp+2
	//getSum(1)
	
	public static void main(String[] args) {
		System.out.println("1到4的和是"+getSum(4));

	}

}
