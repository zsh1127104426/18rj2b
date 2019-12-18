package com.api;

import java.util.Random;

public class Random_test {
	
	public static void main(String[] args) {
		//生成[0,1)的随机数
		System.out.println("生成[0,1)的随机数"+Math.random());
		Random r=new Random();
		System.out.println("生成[0,1)的随机数"+r.nextDouble());
		//生成整数
		System.out.println("生成-21亿到21亿的随机数"+r.nextInt());
		System.out.println("生成[0,100)的随机数"+r.nextInt(100));
	}

}
