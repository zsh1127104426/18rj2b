package com.api;

import java.text.*;
import java.time.*;
import java.util.*;

public class Date_teste {

	public static void main(String[] args) throws ParseException {
		Date d1=new Date();
		Date d2=new Date(System.currentTimeMillis());
		Date d3=new Date(System.currentTimeMillis()+1000);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年MM月dd日 HH:mm:ss E");
		System.out.println(sdf.format(d1));
		
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);//获取当前年份
		int month=c.get(Calendar.MONTH)+1;//获取当前月份
		int date=c.get(Calendar.DATE);//获取当前日
		int hour=c.get(Calendar.HOUR);//获取时
		int minute=c.get(Calendar.MINUTE);//获取分
		int second=c.get(Calendar.SECOND);//获取秒
		System.out.println("当前时间为："+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+minute+"秒");
		
		c.add(Calendar.YEAR,100);
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH)+1;
		date=c.get(Calendar.DATE);
		System.out.println("100年以后为："+year+"年"+month+"月"+date+"日");
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		LocalDate ldf1=LocalDate.now();
		//用sdf1对象来解决当前日期加100天
		//simpleDateFormat:parse方法将字符串解析为Date类的对象
		//simpleDateFormat:format方法将Date类的对象格式化为字符串
		Date d4=sdf1.parse(""+ldf1.plusDays(100));
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("100天以后为："+sdf2.format(d4));
		/*SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
		LocalDate ld=LocalDate.now();
		Date d=sdf1.parse(""+ldf1.plusYears(100));
		SimpleDateFormat sd2=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("100年以后为："+sd2.format(d));*/
		
		System.out.println("今年是:"+Year.now()+"年");
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM");
		Date d5=sdf3.parse(""+YearMonth.now());
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月");
		System.out.println("当前年月是:"+sdf4.format(d5));
		
		//输出系统时区
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println("当前系统时区是:"+zoneId);
		
		//Instant:此刻以UTC为基准	
		Instant instant=Instant.now();
		System.out.println("当前时间为:"+instant);
	}

}
