package com.Input_Output;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_test {

	public static void main(String[] args) {
		//Paths:工具类   Path:路径接口
		Path path=Paths.get("e:\\2019下半年\\java基础\\");
		System.out.println("这个路径的根路径是:"+path.getRoot());
		System.out.println("这个路径的父路径是:"+path.getParent());
		System.out.println("这个路径的路径名称数:"+path.getNameCount());
		for(int i=0;i<path.getNameCount();i++) {
			System.out.println("索引为"+i+"的路径的名称为:"+path.getName(i));
		}
		System.out.println("path的urI的路径为"+path.toUri());
		System.out.println("path的绝对路径为"+path.toAbsolutePath());
	}

}
