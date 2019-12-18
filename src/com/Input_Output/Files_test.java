package com.Input_Output;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		//定义一个目录路径的对象
		Path lujing=Paths.get("D:\\360Downloads000\\txt");
		//用Files工具类根据Path对象创建多级目录
		Files.createDirectories(lujing);
		System.out.println("目录创建成功!");
		//定义一个文件路径的Path值
		Path wj=Paths.get("D:\\360Downloads000\\txt\\test.txt");
		//创建一个list集合，并向集合中添加内容
		//Files.createFile(wj);
		List<String> neirong=new ArrayList<String>();
		neirong.add("这是一个测试文件");
		//将集合中的内容追加写入到指定的文件中
		Files.write(wj,neirong,StandardOpenOption.APPEND);
		List<String> lines=Files.readAllLines(wj);
		System.out.println("文件的大小为:"+Files.size(wj)+"字节");
		System.out.println("文件中的内容为:"+lines);
		
		
	}

}
