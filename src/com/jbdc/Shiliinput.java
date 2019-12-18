package com.jbdc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shiliinput {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		for(int i=0;i<rows;i++) {
			//读取每一行
			XSSFRow row=sheet.getRow(i);
			//找到第四个单元格
			XSSFCell cell=row.getCell(3);
			//读取这个单元格的值
			String xuehao=cell.getStringCellValue();
			//System.out.println(xuehao);
			//找到第16个单元格
			XSSFCell cell16=row.getCell(15);
			//读取这个单元格的值
			String zuo_shili=cell16.getStringCellValue();
			//System.out.println("左视力:"+zuo_shili);
			//找到第17个单元格
			XSSFCell cell17=row.getCell(16);
			//读取这个单元格的值
			String you_shili=cell16.getStringCellValue();
			//System.out.println("右视力:"+you_shili);
			
			// 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动获得连接连接对象
			Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
			//通过连接对象获得语句对象
			//Statement yuju=lianjie.createStstement();
			//获得预定义语句
			//创建PreparedStatement语句
			PreparedStatement ydy_yuju=lianjie.prepareStatement("UPDATE 18rj2 SET `左眼裸眼视力`=? ,`右眼裸眼视力`=? WHERE `学号`= ?");
			//绑定预定义语句问好的值
			ydy_yuju.setString(1,zuo_shili);
			ydy_yuju.setString(2,you_shili);
			ydy_yuju.setString(3,xuehao);
			//通过语句对象执行sql
			ydy_yuju.executeUpdate();
		}
	}

}
