package com.ruanjian2ban;

public class maopaopaixu {
	public static void main(String[] args) {
		int[] array={9,8,3,5,2};
		System.out.println("这个数组的长度是"+array.length);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();//换行
		/* 冒泡排序第一趟：2  9835
		 * 冒泡排序第一趟：23  985
		 * 冒泡排序第一趟：235  98
		 * 冒泡排序第一趟：23589
		 */
		//定义外循环，表示趟数
		for(int m=1;m<array.length;m++) {
			//定义内循环，比较第m趟要比较的两个数
			for(int n=0;n<array.length-m;n++) {
				if(array[n]>array[n+1]) 
				{
					int temp=array[n];
					array[n]=array[n+1];
					array[n+1]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
