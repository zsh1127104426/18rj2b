package com.inner_class;

import com.ruanjian2ban.changliang;

@FunctionalInterface
interface Calcable{
	int calc(int num);
}
//Math类已经实现了Calcable接口
class Math{
	public static int abs(int num) {
		if(num>=0) {
			return num;
		}
		else {
			return -num;
		}
	}
}
public class E20 {

	public static void main(String[] args) {
		//lambda表达式
		printAbs(-50,n->Math.abs(n));
		//类名引用静态方法
		printAbs(-40,Math::abs);

	}

	private static void printAbs(int i, Calcable c) {
		System.out.println(c.calc(i));
		
	}

}
