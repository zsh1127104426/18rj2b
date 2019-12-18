package com.jihe;

import java.util.HashSet;

public class Set_test {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashSet<Comparable> set=new HashSet<Comparable>();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		set.add("Pete");
		System.out.println("来自哈希集的输出");
		set.forEach(obj->System.out.println(obj));
		
		//HashSet能够去掉重复元素，是因为HashSet里的Integer类已经重写了Object类的hsshCode()以及equals()方法
		set.removeAll(set);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(5);
		System.out.println("来自哈希集的输出");
		set.forEach(obj->System.out.println(obj));
	}

}
