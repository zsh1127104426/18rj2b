package com.api;

import java.util.*;/*第一种*/
/*二：或者import java.util.Properties;
import java.util.Set;*/

public class System_text {

	public static void main(String[] args) {
		Properties shuxing=System.getProperties();
		System.out.println(shuxing);
		Set<String> shuxingming=shuxing.stringPropertyNames();
		for(String key : shuxingming) {
			String value=System.getProperty(key);
			System.out.println(key+"--->"+value);
		}
		

	}

}
