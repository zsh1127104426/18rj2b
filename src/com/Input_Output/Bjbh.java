package com.Input_Output;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Bjbh {

	public static void main(String[] args) throws Exception {
		//定义一个文件的对象
		Path wj=Paths.get("E:\\2019下半年\\java基础\\18软件2班翟世豪\\班级信息.txt");
		Path bjmc=Paths.get("E:\\2019下半年\\java基础\\18软件2班翟世豪\\求班级编号.txt");
		
		//读取文件中的内容
		List<String> lines=Files.readAllLines(wj);
		List<String> names=Files.readAllLines(bjmc);
		System.out.println("文件的大小为:"+Files.size(wj)+"字节");
		//System.out.println("文件中的内容为:"+lines);
		for(String name:names) {
			for(String line:lines) {
				String[] zfcsz=line.split("	");
				System.out.print("班级编号:"+zfcsz[0]+"	");
				System.out.println("班级名称:"+zfcsz[1]);
			}
		}
			
	}

}
