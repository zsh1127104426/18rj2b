package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		//如果往TreeSet里插入整数，由于整数所在的Integer类implements  Comparable
		//这个接口，所以TreeSet可以对它们进行排序
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(25);
		ts.add(22);
		ts.add(12);
		ts.add(3);
		ts.add(8);
		ts.add(4);
		ts.add(15);
		ts.add(21);
		ts.add(19);
		System.out.println("创建的TreeSet集合为："+ts);
		System.out.println("TreeSet集合首元素为："+ts.first());
		System.out.println("TreeSet集合最后一个元素为："+ts.last());
		System.out.println("TreeSet集合中小于10的最大元素为："+ts.lower(10));
		System.out.println("TreeSet集合中小于或等于12的最大元素为："+ts.lower(12));
		System.out.println("TreeSet集合中大于10的最小元素为："+ts.higher(10));
		System.out.println("TreeSet集合中大于或等于12的最小元素为："+ts.ceiling(12));
		System.out.println("TreeSet集合中的删除第一个元素是："+ts.first());
		System.out.println("TreeSet集合中的删除最后一个元素是："+ts.last());
		System.out.println("TreeSet集合中的删除第一个元素是："+ts.pollFirst());
		System.out.println("TreeSet集合中的删除最后一个元素是："+ts.pollLast());
		System.out.println("TreeSet集合中的删除第一个与最后一个元素后集合是："+ts);

	}

}
