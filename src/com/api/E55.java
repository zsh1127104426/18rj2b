package com.api;

public class E55 {

	public static void main(String[] args) {
		String s1="java";
		char[] charArray=s1.toCharArray();
		System.out.println("将字符串转成字符数组的遍历结果：");
		for(int i=0;i<charArray.length;i++) {
			if(i !=charArray.length-1) {
				System.out.print(charArray[i]+",");
			}
			else {
				System.out.print(charArray[i]);
			}
		}
		System.out.println("将int值转换为String类型之后的结果："+String.valueOf(12));
		System.out.println("将字符串转换成大写之后的结果："+s1.toUpperCase());
		
		String s2="      http  ://   localhost  :  8080     ";
		System.out.println("去掉字符串两端空格后的结果是："+s2.trim());
		System.out.println("去掉字符串中所有空格后的结果是："+s2.replace(" ",""));
		//第一个斜杠是为了表示第二个斜杠是一个斜杠
		System.out.println("去掉字符串中所有空格后的结果是："+s2.replace("\\s+",""));
	}

}
