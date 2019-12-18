package com.Input_Output;

import java.io.*;

public class FileInputStream_test {

	public static void main(String[] args) throws Exception {
		/*FileInputStream in=new FileInputStream("test.txt");
		FileOutputStream out=new FileOutputStream("out.txt");
		int b=in.read();
		while(b!=-1) {
			System.out.print(b);
			out.write(b);
			b=in.read();
		}
		out.write("come on!".getBytes());
		in.close();	
		out.close();*/
		FileInputStream in=new FileInputStream("d://w.jpg");
		FileOutputStream out=new FileOutputStream("w.jpg");
		long bt=System.currentTimeMillis();
		int len=in.read();
		while(len!=-1) {
			out.write(len);
			len=in.read();
		}
		long et=System.currentTimeMillis();
		System.out.println("花费时间为:"+(et-bt)+"毫秒");
		in.close();
		out.close();
	}

}
