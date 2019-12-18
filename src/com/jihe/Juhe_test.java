package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Juhe_test {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("赛狗");
		list.add("吕狗");
		list.add("吕猪");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("吕"));
		Stream<String>stream3=stream2.limit(2);
		stream3.forEach(j->System.out.println(j));
		System.out.println("======");
		list.stream().filter(i->i.startsWith("张")).limit(2).forEach(j->System.out.println(j));
		System.out.println();
		
		Stream<String>liu=list.stream();
		liu.forEach(j->System.out.println(j));
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("张"));
		System.out.print("集合所有姓张的人：");
		liu3.forEach(j->System.out.println(j));
		System.out.print("2集合所有姓张的人：");
		list.stream().filter(k->k.startsWith("张")).forEach(j->System.out.println(j));
	}

}
