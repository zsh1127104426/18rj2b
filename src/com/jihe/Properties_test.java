package com.jihe;

import java.io.*;
import java.util.*;

public class Properties_test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties sxj=new Properties();
		sxj.load(new FileInputStream("d:\\test.properties"));
		sxj.forEach((k,v)->System.out.println(k+"="+v));
		FileOutputStream out=new FileOutputStream("d:\\test.properties");
		sxj.setProperty("charset","UTF-8");
		sxj.store(out,"新增charset编码");
	}

}
