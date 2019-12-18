package com.ruanjian2ban;

public class Condition {

	public static void main(String[] args) {
		//if else条件  可以是范围
		int age=17;
		if(age<18)
			System.out.println("此人未成年");
		else if(age<12)
			System.out.println("此人是儿童");
		//switch case条件是离散的
		int month=5;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("当前时间为冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("当前时间为春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("当前时间为夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("当前时间为秋季");
			break;	
		default:
			System.out.println("输入的月份不正确！！！");
			break;
		}
	}

}
