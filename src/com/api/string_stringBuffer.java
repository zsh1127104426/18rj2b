package com.api;

public class string_stringBuffer {

	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		
		String s3=new String("a");
		String s4=new String("b");
		String s5=s3+s4;
		System.out.println(s5);
		/*StringBuffer sb3=new StringBuffer("a");
		StringBuffer sb4=new StringBuffer("b");
		StringBuffer sb5=sb3+sb4    编译出错*/
	}

}
