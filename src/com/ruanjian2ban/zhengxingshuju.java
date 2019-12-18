package com.ruanjian2ban; //package：包
/*
 * 紫色的代码是关键字
 * 褐色的代码是参数或者局部调整
 * 蓝色代码是成员变量，它的地位比局部变量高，同成员方法一样
 * 黑色的代码是标识符：包名（com.ruanjian2ban）、类名（zhengxingshuju）（第一个字母大写）、方法名（main、println、整型字面量）
*/
public class zhengxingshuju{   //class：类         public：修饰符  表示公有
		public static void main(String[] args) {   //static：修饰符  表示静态的            void：空的
					byte 	b=1;     //00000001
					short 	s=1;		//00000000		00000001
					int 		i=1;		//00000000 	00000000	00000000 	00000001
					long 	l=1;		//00000000 	00000000	00000000 	00000000	00000000 	00000000	00000000 	00000001
					
					float f=1.0f;//1.0是双精度浮点数长度是64位，而float是32位
					             //1.0f是单精度浮点数长度是32位
					double d=1.0;
					
					char c='a';//用单引号将字符常量括起来
					char ci=97;
					short cc=97;
					
					System.out.println(c);
					System.out.println(ci);
					System.out.println((char)cc);
					
					boolean flag1=true;
					boolean flag2=false;
					
					System.out.println("字节型整数数据的长度是"+Byte.SIZE);
					System.out.println("短整型整数数据的长度是"+Short.SIZE);
					System.out.println("整型整数数据的长度是"+Integer.SIZE);
					System.out.println("长整型型整数数据的长度是"+Long.SIZE);
					
					System.out.println("单精度浮点型数据的长度是"+Float.SIZE);
					System.out.println("双精度浮点型数据的长度是"+Double.SIZE);
					
					System.out.println("字节型整数数据的范围是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
					System.out.println("短整型整数数据的范围是"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
					System.out.println("整型整数数据的范围是"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
					System.out.println("长整型型整数数据的范围是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
					
					System.out.println("单精度浮点型数据的范围是"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
					//1.4E-45-3.4028235E38
					//1.4*10^-45-3.4028235*10^38
					System.out.println("双精度浮点型数据的范围是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
					//4.9E-324-1.7976931348623157E308
					//4.9*10^-324-1.7976931348623157*10^308
					
					System.out.println("字符型数据的范围是"+(short)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
					//short 短整型 范围三万
					
					System.out.println("布尔型数据的范围是"+Boolean.TRUE+"-"+Boolean.FALSE);
		}
}
