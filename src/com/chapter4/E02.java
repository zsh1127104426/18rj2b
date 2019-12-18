package com.chapter4;

import javax.net.ssl.ExtendedSSLSession;

import org.omg.CORBA.PUBLIC_MEMBER;

class Animal_1{
	public Animal_1(String name) {
		System.out.println("我是一只"+name);
	}
}
class Dog_1 extends Animal_1{
	public Dog_1() {
		super("沙皮狗");
	}
}
public class E02 {
	public static void main(String[] args) {
		Dog_1 dog=new Dog_1();
	}
}
