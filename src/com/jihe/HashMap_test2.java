package com.jihe;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_test2 {

	public static void main(String[] args) {
		//赋值符号左边的类或接口可以使右边的类的上一代
		Map<String, String> hmap=new HashMap<String, String>();
		hmap.put("1","jake");
		hmap.put("2","makes");
		hmap.put("3","cool");
		hmap.put("4","jake");
		hmap.put("5","masher");
		System.out.println(hmap);
		
		if(hmap.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
			System.out.println("这个双列集合中键1的值为"+hmap.get("1"));
		}
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		//将双列集合Map变成单列的值对象集合使用values()方法
		System.out.println("这个双列集合中所有键的集合是："+hmap.keySet());
		System.out.println("这个双列集合中所有值的集合是："+hmap.values());
		//将键1的值改为Andy
		hmap.replace("1","Andy");
		System.out.println(hmap);
		//删除键1对应的键key值+value=对entry
		hmap.remove("1");
		System.out.println(hmap);
		
		System.out.println("用键集遍历双列集合的键和值：");
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<String> jianji=hmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while(diedai.hasNext()) {
			Object key=(Object)diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
		}
		
		System.out.println("用键值对集遍历双列集合的键和值：");
		Set<Entry<String, String>> jianzhiduiji=hmap.entrySet();
		Iterator<Entry<String, String>> diedai2=jianzhiduiji.iterator();
		while(diedai2.hasNext()) {
			Map.Entry<String, String> jianzhidui=(Map.Entry<String, String>) diedai2.next();
			Object key=jianzhidui.getKey();
			Object value=jianzhidui.getValue();
			System.out.println(key+":"+value);
		}
		System.out.println("用foreach键值对集编历双列集合的键和值");
		hmap.forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("用foreach键值对集编历双列集合的所有值");
		Collection<String> zhiji=hmap.values();
		zhiji.forEach(value->System.out.println(value));
		
		Map<String, String> map1=new HashMap<String, String>();
		map1.put("1","jake");
		map1.put("3","cool");
		map1.put("2","makes");
		map1.forEach((key,value)->System.out.println(key+":"+value));
		System.out.println("==========================");
		Map<String, String> map2=new LinkedHashMap<String, String>();
		map2.put("1","jake");
		map2.put("3","cool");
		map2.put("2","makes");
		map2.forEach((key,value)->System.out.println(key+":"+value));
	}

}
