package com.jihe;

import java.util.TreeSet;

class Teacher implements Comparable<Object>{
	String name;
	int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return  name + ":" + age ;
	}
	@Override
	public int compareTo(Object obj) {
		Teacher s=(Teacher)obj;
		if(this.age-s.age>0) {
			return 1;
		}
		if(this.age-s.age==0){
			return this.name.compareTo(s.name);
		}
		return -1;
	}
	
}
public class TreeSet_test2 {

	public static void main(String[] args) {
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("row",21));
		ts.add(new Teacher("Jake",19));
		ts.add(new Teacher("tom",23));
		ts.add(new Teacher("row",21));
		System.out.println(ts);
	}

}
