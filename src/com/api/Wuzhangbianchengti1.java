package com.api;

public class Wuzhangbianchengti1 {

	public static void main(String[] args) {
		String zfc=new String("HelloWorld");
		/*for(int i=zfc.length()-1;i>=0;i--) {
			if(zfc.charAt(i)>='a'&&zfc.charAt(i)<='z') {
				System.out.print((char)(zfc.charAt(i)-32));
			}
			else if(zfc.charAt(i)>='A'&&zfc.charAt(i)<='Z') {
				System.out.print((char)(zfc.charAt(i)+32));
			}
		}*/
		/*StringBuffer sb=new StringBuffer();
		char[] zfsz=zfc.toCharArray();
		for(int i=zfsz.length-1;i>=0;i--) {
			char zf=zfsz[i];
			if(Character.isUpperCase(zf)) {
				String zfc1=(""+zf).toLowerCase();
				sb.append(zfc1);
			}
			else if(Character.isLowerCase(zf)) {
				String zfc2=(""+zf).toUpperCase();
				sb.append(zfc2);
			}
		}
		System.out.println(sb);*/
		StringBuffer sb=new StringBuffer("HelloWorld");
		sb.reverse();
		for (int i=0;i<sb.length();i++) {
			char zf=sb.charAt(i);
			if(Character.isUpperCase(zf)) {
				sb.setCharAt(i,(char)(zf+32));
			}
			else if(Character.isUpperCase(zf)) {
				sb.setCharAt(i,(char)(zf-32));
			}
			System.out.println(sb);
		}
 	}

}
