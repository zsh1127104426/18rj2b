package com.Input_Output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("reader.txt");
		FileWriter fw=new FileWriter("writer.txt");
		char []buff=new char[2048];
		int b=fr.read(buff);
		while(b!=-1) {
			fw.write(buff,0,b);
			//System.out.print((char)b);
			b=fr.read(buff);
		}
		fr.close();
		
		fw.write("轻轻的我走了,\r\n");
		fw.write("正如我轻轻地来；\r\n");
		fw.write("我轻轻的招手,\r\n");
		fw.write("作别西天的云彩\r\n");
		fw.close();
	}

}
