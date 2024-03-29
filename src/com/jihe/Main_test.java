package com.jihe;

import java.util.*;
import java.util.List;

public class Main_test {

	public static void main(String[] args) {
		Test test=new Test();
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		long kssj1=System.currentTimeMillis();
		//从头部插入元素时，每次后面的每一个元素都要移动一个位置，消耗了大量时间
		test.listInsert(arrayList);
		long jssj1=System.currentTimeMillis();
		System.out.println("数组列表头部插入15万个元素耗时"+(jssj1-kssj1)+"毫秒");
		
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		long kssj2=System.currentTimeMillis();
		test.listInsert(linkedList);
		long jssj2=System.currentTimeMillis();
		System.out.println("链表头部插入15万个元素耗时"+(jssj2-kssj2)+"毫秒");
		
		long kssj3=System.currentTimeMillis();
		test.listRead(arrayList);
		long jssj3=System.currentTimeMillis();
		System.out.println("数组列表尾部读取15万个元素耗时"+(jssj3-kssj3)+"毫秒");
		
		long kssj4=System.currentTimeMillis();
		test.listRead(linkedList);
		long jssj4=System.currentTimeMillis();
		System.out.println("链表头部读取15万个元素耗时"+(jssj4-kssj4)+"毫秒");
	}

}
class Test{

	public void listInsert(List<Integer> list) {
		for(int i=0;i<150000;i++) {
			list.add(0,i);
		}	
	}
	public void listRead(List<Integer> list) {
		for(int i=150000-1;i>=0;i--) {
			list.get(i);
		}	
	}
	
}