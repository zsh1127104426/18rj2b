package com.Input_Output;

import java.io.File;

public class FileList_test {
	static long max=0;
	public static void main(String[] args) {
		File ml=new File("D:\\18软件作业");
		FileDir(ml);
		

	}

	private static void FileDir(File ml) {
		File[] wjsz=ml.listFiles();
		//foreach
		for(File file:wjsz) {
			if(file.isDirectory()) {
				FileDir(file);
			//String[] zml=wjsz.list((dir,name)->name.endsWith(".java"));
			//Arrays.stream(zml).forEach(f->System.out.println(f));
			}
			else if(file.isFile()) {
				if(file.getName().endsWith(".jpg")) 
					FileDir(file);
				if(file.length()>max) {	
				max=file.length();
				System.out.println(file.getAbsolutePath()+"的长度是"+file.length());
				}
			}
		}
		
	}

}
