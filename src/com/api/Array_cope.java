package com.api;

public class Array_cope {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {101,102,103,104,105,106,107,108,109};
		System.arraycopy(a, 5, b, 0, 4);
		for(int i=0;i<b.length;i++) {
			System.out.println(i+":"+b[i]);
		}
	}

}
