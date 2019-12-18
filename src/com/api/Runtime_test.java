package com.api;

import java.io.IOException;

public class Runtime_test {

	public static void main(String[] args) throws IOException, InterruptedException{
		Runtime rt=Runtime.getRuntime();
		System.out.println("本机的处理器有"+rt.availableProcessors()+"个");
		System.out.println("本机的空闲内存大小为"+rt.freeMemory()/1024/1024+"MB");
		System.out.println("本机的最大可用内存大小为"+rt.maxMemory()/1024/1024+"MB");
		
		Process jincheng=rt.exec("notepad");//notepad记事本    mspaint画图
		Thread.sleep(3000);
		jincheng.destroy();
		
	}
}
