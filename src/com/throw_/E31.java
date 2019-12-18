package com.throw_;
class BlcException extends Exception{

	public BlcException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public BlcException(String arg0) {
		super(arg0);
		// TODO 自动生成的构造函数存根
	}
}
public class E31 {
	public static int divide(int x,int y)throws BlcException{
		if(y==0) {
			throw new BlcException("除数是0");
		}
		int result=x/y;
		return result;
	}
	public static void main(String[] args) {
		try {
			int result = divide(4,0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获的异常信息为："+e.getMessage());
		}
		

	}

}
