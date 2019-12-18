package com.Input_Output;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		//创建CharBuffer对象，并指定缓冲区容量大小为6
		CharBuffer cbf=CharBuffer.allocate(6);
		System.out.println("这个字符缓冲区容量是:"+cbf.capacity());
		System.out.println("这个字符缓冲区接限值是:"+cbf.limit());
		System.out.println("这个字符缓冲区初始位置是:"+cbf.position());
		//向CharBuffer对象中放入3个元素
		cbf.put("a");
		cbf.put("b");
		cbf.put("c");
		System.out.println("添加三个元素以后这个字符缓冲区容量是:"+cbf.capacity());
		System.out.println("添加三个元素以后这个字符缓冲区接限值是:"+cbf.limit());
		System.out.println("添加三个元素以后这个字符缓冲区初始位置是:"+cbf.position());
		//执行反转方法
		cbf.flip();
		System.out.println("添加三个元素并反转之后这个字符缓冲区容量是:"+cbf.capacity());
		System.out.println("添加三个元素并反转之后这个字符缓冲区接限值是:"+cbf.limit());
		System.out.println("添加三个元素并反转之后这个字符缓冲区初始位置是:"+cbf.position());
		//取出第一个元素
		System.out.println("去除第一个元素是:"+cbf.get());
		System.out.println("添加三个元素并反转去除第一个元素之后这个字符缓冲区容量是:"+cbf.capacity());
		System.out.println("添加三个元素并反转去除第一个元素之后这个字符缓冲区接限值是:"+cbf.limit());
		System.out.println("添加三个元素并反转去除第一个元素之后这个字符缓冲区初始位置是:"+cbf.position());
		//执行clear方法
		cbf.clear();
		System.out.println("执行clear方法之后这个字符缓冲区容量是:"+cbf.capacity());
		System.out.println("执行clear方法之后这个字符缓冲区接限值是:"+cbf.limit());
		System.out.println("执行clear方法之后这个字符缓冲区初始位置是:"+cbf.position());
	}

}
