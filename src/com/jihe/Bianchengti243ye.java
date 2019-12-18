package com.jihe;

import java.util.HashSet;

class Person implements Comparable<Object>{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return name.equals(other.name);
	}
	@Override
	public String toString() {
		return  name + ":" + age ;
	}
	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		return 0;
	}
}
public class Bianchengti243ye {

	public static void main(String[] args) {
		HashSet<Person> hs=new HashSet<Person>();
		hs.add(new Person("Jack",18));
		hs.add(new Person("color",16));
		hs.add(new Person("phone",19));
		System.out.println(hs);

	}

}
