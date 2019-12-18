package com.ruanjian2ban;

public class E_04 {
	public static void main(String[] args) {
		int x=12;
		//{}是变量的作用域
		{
			int y=96;
			System.out.println("x="+x);
			System.out.println("y="+y);
		}
		System.out.println("x="+x);
		//System.out.println("y="+y);
	}
}
