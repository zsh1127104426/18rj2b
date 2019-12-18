package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class CharSender implements Runnable {
	private DatagramSocket ds;
	private int port;
	public CharSender(DatagramSocket ds, int port) {
		this.ds=ds;
		this.port=port;
	}

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("我说:");
				String str=sc.nextLine();
				//将数据转换为二进制字节数组
				byte[] zjsz;
				zjsz = str.getBytes("UTF-8");
				System.out.println("这条信息要发送给哪个IP:");
				//定义要发送的数据
				String ip=sc.nextLine();
				//创建要发送的数据报
				DatagramPacket dp=new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName(ip),8900);
				//通过套接字发送数据报
				ds.send(dp);	
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}	
			
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
