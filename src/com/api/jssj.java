package com.api;

public class jssj {

	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<1000000000;i++) {
			sum+=i;
		}
		long jssj=System.currentTimeMillis();
		System.out.println("加到一百亿的时间为："+(jssj-kssj)+"毫秒");
	}

}
