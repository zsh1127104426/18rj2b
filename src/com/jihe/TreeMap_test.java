package com.jihe;

import java.util.*;

class CustomComparator implements Comparator<Object>{

	@Override
	public int compare(Object obj1, Object obj2) {
		String key1=(String)obj1;
		String key2=(String)obj2;
		return key2.compareTo(key1);
	}
	
}
public class TreeMap_test {

	public static void main(String[] args) {
		Map<String, String> map=new TreeMap<String, String>(new CustomComparator());
		map.put("2","Jake");
		map.put("1","Makes");
		map.put("3","color");
		map.put("4","hhhh");
		System.out.println(map);
	}

}
