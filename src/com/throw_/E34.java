package com.throw_;

public class E34 {
	public static void printAge(int age)throws Exception{
		if(age<=0) {
			throw new Exception("输入的年龄有误,必须是正整数!");
		}
		else {
			System.out.println("此人年龄为："+age);
		}
	}
	public static void main(String[] args) {
		int age=-1;
		try {
			printAge(age);
		}
		catch(Exception e){
			System.out.println("捕获的异常信息为："+e.getMessage());
		}

	}

}
