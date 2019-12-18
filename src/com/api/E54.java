package com.api;

public class E54 {
	
	public static void main(String[] args) {
		String s1="我12想2静静458abc1a3b6cc3b7a8n4b1a5.jpg";
		System.out.println("这个字符里的数字是：");
		//将字符串打碎成字符数组
		char[] zfsz=s1.toCharArray();
		//foreach循环：对于字符数组里德每个字符
		//冒号前面是集合或者数组里的单个元素，冒号后面是集合或者数组
		for(char zf : zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		System.out.println("这个字符里的字符是：");
		for(char zf : zfsz) {
			if(zf>='a'&&zf<='z') {
				System.out.print(zf);
			}
		}
		System.out.println("\n这个字符里面的文字：");
		for(char zf : zfsz) {
			if(zf>'\u4e00'&&zf<='\u9FA0'){
				System.out.print(zf);
			}
		}
	}

}
