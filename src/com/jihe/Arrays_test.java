package com.jihe;

import java.util.Arrays;

public class Arrays_test {

	public static void main(String[] args) {
		int[] arr= {9,8,5,0,3,4,1};
		System.out.print("排序前:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.print("排序后:");
		printArray(arr);
		
		Arrays.sort(arr);
		int index=Arrays.binarySearch(arr,3);
		System.out.println("元素3的索引是:"+index);
		//被拷贝的数组
		int[] copy=Arrays.copyOfRange(arr, 1, 7);
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]+"");
		}
		//用8替换数组中的每个元素
		Arrays.fill(arr,8);
		for(int j=0;j<arr.length;j++) {
			System.out.println(j+":"+arr[j]);
		}
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}
			else {
				System.out.println(arr[i]+"]");
			}
		}
	}

}
