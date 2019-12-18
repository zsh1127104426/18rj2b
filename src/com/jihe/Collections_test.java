package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_test {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		Collections.addAll(list,"a","z","k","y","h","j","d");
		System.out.println("排序前:"+list);
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("按自然顺序排序后:"+list);
		Collections.shuffle(list);
		System.out.println("按随机顺序排序后:"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("集合首尾元素交换后:"+list);
		
		System.out.println();
		
		ArrayList<String>list2=new ArrayList<>();
		Collections.addAll(list2,"0","15","-6","-2","7","5","2");
		System.out.println("集合中的元素:"+list2);
		System.out.println("集合中最大元素:"+Collections.max(list2));
		System.out.println("集合中最小元素:"+Collections.min(list2));
		Collections.replaceAll(list2,"7","-7");
		System.out.println("替换后的集合为:"+list2);
		Collections.sort(list2);
		System.out.println("集合排序后为:"+list2);
		int index=Collections.binarySearch(list2, "7");
		System.out.println("集合通过二分查找方法查找元素7所在的角标为:"+index);
		
	}

}
