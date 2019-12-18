package com.jihe;

import java.util.*;

public class Died {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		//arrayList.add(2);
		System.out.println("数组列表arrayList的长度是"+arrayList.size());
		System.out.println("数组列表arrayList的第二个元素是"+arrayList.get(1));
		//使用迭代读取集合中的每个元素
		Iterator<String> diedai1=arrayList.iterator();
		//hasNext判断是否有下一个元素
		while(diedai1.hasNext()) {
			//next方法读取下一个元素
			String dgys/*单个元素*/=diedai1.next();
			System.out.println(dgys);
		}
		System.out.println("使用foreach循环输出每个元素：");
		for(String mgys:arrayList) {
			System.out.println(mgys);
		}
		
		System.out.println("利用列表集合对象使用JDK8的foreach循环输出每个元素：");
		arrayList.forEach(obj->System.out.println(obj));
		
		System.out.println("利用迭代集合对象使用JDK8的foreach循环输出每个元素：");
		Iterator<String> diedai2=arrayList.iterator();
		diedai2.forEachRemaining(obj->System.out.println(obj));
	}

}
