package com.jihe;

import java.util.HashMap;
import java.util.Map;

public class HashMap_test {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1","Jack");
		map.put("2","make");
		map.put("3","sorry");
		map.put("4","Jack");
		map.put("1","Luck");
		System.out.println(map);
		
		if(map.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
		}
		System.out.println("这个双列集合键1的值为"+map.get("1"));
	}

}
