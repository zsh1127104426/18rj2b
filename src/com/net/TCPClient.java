package com.net;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		//创建客户端套接字要带上服务器的IP地址和端口
		Socket khdtjz=new Socket("10.2.103.31",8899);
		//通过客户端套接字获取写入的网络的输出流
		OutputStream os=khdtjz.getOutputStream();
		//定义要上传的文件输入流
		FileInputStream fin=new FileInputStream("d:\\1.jpg");
		//通过客户端套接字获取网络上传来的输出流
		
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
			//System.out.print(b);
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		
		//通过客户端套接字获取网络上传来的输出流
		//InputStream is=khdtjz.getInputStream();
		//定义缓冲区
		//byte[] zjhc=new byte[1024];
		//将缓冲区中的内容读入到输入流中，最后放到整型变量中
		InputStream is=khdtjz.getInputStream();
		b=is.read(zjhc);
		while(b!=-1) {
			//System.out.print(b);
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();
	}

}
