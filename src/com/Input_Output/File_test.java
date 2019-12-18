package com.Input_Output;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File_test {

	public static void main(String[] args) {
		File file=new File("example.txt");
		System.out.println("文件名是:"+file.getName());
		System.out.println("文件的相对路径是:"+file.getPath());
		System.out.println("文件的绝对路径是:"+file.getAbsolutePath());
		System.out.println("文件的父路径是:"+file.getParent());
		System.out.println(file.canRead()?"文件可读":"文件不可读");
		System.out.println(file.canWrite()?"文件可写":"文件不可写");
		System.out.println(file.isFile()?"是一个文件":"不是一个文件");
		System.out.println(file.isDirectory()?"是一个目录":"不是一个目录");
		System.out.println(file.isAbsolute()?"是绝对路径":"不是绝对路径");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println("最后修改时间为:"+sdf.format(new Date(file.lastModified())));
		System.out.println("文件大小为:"+file.length()+"字节");
		System.out.println("是否成功删除文件:"+file.delete());
	}

}
