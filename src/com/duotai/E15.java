package com.duotai;
interface Animal{//abstract class Animal
	void shout();//abstract void shout();
}
class Dog implements/*extends*/ Animal{
	@Override
	public void shout() {
		System.out.println("汪汪...");
	}
}
class Cat implements/*extends*/ Animal{
	@Override
	public void shout() {
		System.out.println("喵喵...");
	}
}
public class E15 {

	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat=new Cat();
		dog.shout();
		cat.shout();
	}
}
