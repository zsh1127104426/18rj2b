package com.jihe;

import java.util.*;

public class List_test {

	public static void main(String[] args) {
		//<>是泛型，里面的类型是集合里元素的类型
		//有两个类，前面一个是集合类，后面尖括号里的是集合里元素类型
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		//arrayList.add(2);
		System.out.println("数组列表arrayList的长度是"+arrayList.size());
		System.out.println("数组列表arrayList的第二个元素是"+arrayList.get(1));

		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("link1");
		linkedList.add("link2");
		System.out.println("数组列表linkedList是"+linkedList);
		linkedList.offer("offer");//向集合尾部增加元素
		linkedList.push("push");//向集合头部增加元素
		System.out.println("数组列表linkedList是"+linkedList);
		System.out.println("数组列表linkedList第一个元素是"+linkedList.get(0));
		System.out.println("数组列表linkedList最后一个元素是"+linkedList.get(3));
		Object object=linkedList.peek();//获取集合中第一个元素
		System.out.println(object);
		linkedList.removeFirst();//删除集合第一个元素
		linkedList.pollLast();//删除集合最后一个元素
		System.out.println(linkedList);
	}

}
