package com.jihe;

import java.util.*;

public class Keben200li6_6 {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		Iterator<String> it=arrayList.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			if("stud2".equals(obj)) {
				/*arrayList.remove(obj);
				break;*/
				it.remove();
			}
		}
		System.out.println(arrayList);

	}

}
