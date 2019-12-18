package com.api;

import java.awt.Window.Type;
import java.util.HashSet;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFCell;

public class Ssq {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("双色球开奖");
		System.out.println("六个红色号码是：");
		
		Random r=new Random();
		HashSet<Integer> hs=new HashSet<>();
		for (int i=0;i<10000;i++) {
			int hq=r.nextInt(33)+1;
			hs.add(hq);
			if(hs.size()==6) {
				break;
			}
		}
		for (Integer hq:hs) {
			System.out.print(hq+" ");
			Thread.sleep(100);
		}
		/*for (int i=0;i<6;i++) {
			int hq=r.nextInt(33);
			System.out.print(hq+" ");
			Thread.sleep(100);
		}*/
		System.out.println();
		System.out.println("蓝色号码是：");
		for (int i=0;i<1;i++) {
			int lq=r.nextInt(33);
			System.out.print(lq+" ");
			Thread.sleep(100);
		}

	}

}
