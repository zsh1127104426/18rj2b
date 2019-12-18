package com.thread;
class TicketWindow4 implements Runnable{
	private int tickets=10;
	@Override
	public void run() {
		while(true) {
			maipiao();
		}
	}
	private synchronized void maipiao(){
		if(tickets>0) {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(tickets>0) {
			System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
		}
	}
}
public class Thread_test12 {

	public static void main(String[] args) {
		TicketWindow4 tw=new TicketWindow4();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();

	}

}
