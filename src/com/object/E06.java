package com.object;

import com.object.Animal;

class Animal{
	void shout() {
		System.out.println("动物叫");
	}
	@Override
	public String toString() {
		return "这是一种动物";
	}
}
public class E06 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		Animal dw2=new Animal();
		System.out.println(dw.toString());
		System.out.println(dw2.toString());

	}

}
