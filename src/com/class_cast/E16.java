package com.class_cast;
interface Animal{
	void shout();
	void eatMan();
}
class Tiger implements Animal{
	//实现接口shout()方法
	public void shout() {
		System.out.println("aow");
	}
	public void eatMan() {
		System.out.println("老虎吃人了");
	}
}
class Pig implements Animal{
	@Override
	public void shout() {
		System.out.println("哼哼...");
	}

	@Override
	public void eatMan() {
		// TODO 自动生成的方法存根
		
	}
}
public class E16 {

	public static void main(String[] args) {
		Animal an1=new Pig/*Tiger*/();
		//判断an1这个对象是否是Tiger类的实例
		if (an1 instanceof Tiger) {
			Tiger tiger=(Tiger) an1;
			tiger.shout();
			tiger.eatMan();
		}
		else {
			System.out.println("这个动物不是老虎");
		}
		/*Animal tiger=new Tiger();
		tiger.shout();
		tiger.eatMan();*/
		//1.((Tiger) tiger).eatMan();
		//2.Tiger tiger2=((Tiger) tiger);
		//  tiger.eatMan();
		
	}

}
