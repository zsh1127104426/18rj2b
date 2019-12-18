package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
class MyThread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for (int i=1;i<11;i++) {
			sum+=i;
		}
		switch(Thread.currentThread().getName()) {
		case "线程1":
			break;
		case "线程2":
			sum+=100;
			break;	
			
		default:
			break;
		}
		return sum;
	}
	
}
public class Thread_test6 {

	public static void main(String[] args) throws Exception, ExecutionException {
		MyThread mt1=new MyThread();
		FutureTask<Object> ft1=new FutureTask<>(mt1);
		Thread t1=new Thread(ft1,"线程1");
		t1.start();
		//System.out.println("线程1求和的结果是"+ft1.get());
		MyThread mt2=new MyThread();
		FutureTask<Object> ft2=new FutureTask<>(mt2);
		Thread t2=new Thread(ft2,"线程1");
		t2.start();
		//System.out.println("线程1求和的结果是"+ft2.get());
		int total=(int)ft1.get()+(int)ft2.get();
		System.out.println("线程1和线程2的求和结果是:"+total);
	}

}
