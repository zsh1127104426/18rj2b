package com.Input_Output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStream_test1 {

	public static void main(String[] args) throws Exception {
		FileInputStream in=new FileInputStream("d://w.jpg");
		FileOutputStream out=new FileOutputStream("w.jpg");
		long bt=System.currentTimeMillis();
		byte[] zx=new byte[1024];
		int b=in.read(zx);
		while(b!=-1) {
			out.write(zx,0,b);
			b=in.read(zx);
		}
		long et=System.currentTimeMillis();
		System.out.println("花费时间为:"+(et-bt)+"毫秒");
		in.close();
		out.close();
		
	}

}
