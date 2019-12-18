package com.jihe;

import java.util.HashSet;

class Student{
	String id;
	String name;
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	public boolean equals1(Object obj) {
		Student other = (Student) obj;
		return this.id.equals(other.id);
		//return this.name.equals(other.name);
	}
	public boolean equals2(Object obj) {
		Student other = (Student) obj;
		//return this.id.equals(other.id);
		return this.name.equals(other.name);
	}
	
	@Override
	public String toString() {
		return id + ":" + name ;
	}
}
public class HashSet_test {

	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		Student s1=new Student("1","Mike");
		Student s2=new Student("1","Mike");
		Student s3=new Student("3","Joke");
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println(hs);
	}

}
