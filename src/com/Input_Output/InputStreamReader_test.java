package com.Input_Output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		/*//定义标准字节输出流
		InputStream jpsr=System.in;
		//将标准字节输出流转换成字符流
		InputStreamReader ir=new InputStreamReader(jpsr);
		//将字符流包装成缓冲字符流
		BufferedReader br=new BufferedReader(ir);*/
		//合并
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("profile.txt")));
		
		System.out.println("自我介绍");
		String line=br.readLine();
		bw.write(line);
		int i=1;
		while(i!=3) {
			if(i==1) {
				System.out.println("请输入您的姓名:");
				bw.write("请输入您的姓名:"+line);
				line=br.readLine();
				System.out.println("您叫:"+line);
				i++;
			}
			else if(i==2) {
				System.out.println("请输入您的年龄:");
				bw.write("请输入您的年龄:"+line);
				line=br.readLine();
				int age=Integer.parseInt(line);
				System.out.println("您明年将是:"+(age+1)+"岁");
				i++;
			}
			
		}
		System.out.println("介绍完成");
		br.close();
		bw.flush();
		bw.close();
		
	}

}
