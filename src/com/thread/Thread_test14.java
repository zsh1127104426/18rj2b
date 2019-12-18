package com.thread;
class DeadLockThread implements Runnable{
	//定义两个不同的锁对象
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		// TODO 自动生成的构造函数存根
		this.flag=flag;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		if(flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					}
				}	
			}
		}
		else {
			synchronized (chopsticks) {
				System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
				}
			}
		}
	}
}
public class Thread_test14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);

	}

}
