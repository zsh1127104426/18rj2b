package com.jihe;

import java.util.*;

public class Bianchengti2_243 {

	public static void main(String[] args) {
		Map<String, String> tmap=new TreeMap<String, String>();
		tmap.put("1","jake");
		tmap.put("4","jake");
		tmap.put("2","makes");
		tmap.put("5","masher");
		tmap.put("3","cool");
		System.out.println(tmap);
		
		System.out.println("用键集遍历双列集合的键和值：");
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<String> jianji=tmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while(diedai.hasNext()) {
			Object key=(Object)diedai.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);
		}

	}

}
