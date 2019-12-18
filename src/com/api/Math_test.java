package com.api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("计算-1绝对值的结果是："+Math.abs(-1));
		System.out.println("计算1.5正弦的结果是："+Math.sin(1.5));
		System.out.println("计算2余弦的结果是："+Math.cos(2));
		System.out.println("计算1正切的结果是"+Math.tan(1));
		System.out.println("计算4平方根的结果是："+Math.sqrt(4));
		System.out.println("计算27立方根的结果是："+Math.cbrt(27));
		System.out.println("计算2^6乘方的结果是："+Math.pow(2,6));
		//ceil天花板     floor地板
		System.out.println("大于参数5.5的最小整数是："+Math.ceil(5.5));
		System.out.println("小于参数5.6的最大整数："+Math.floor(5.6));
		System.out.println("对小数进行四舍五入的结果是："+Math.round(5.2));
		System.out.println("对小数进行取整的结果是："+(int)(5.2));
		System.out.println("求两个数的最大值："+Math.max(1,3));
		System.out.println("求两个数的最小值："+Math.min(2,5));
		System.out.println("生成一个大于等于0.0小于1.0的随机数"+Math.random());


	}

}
