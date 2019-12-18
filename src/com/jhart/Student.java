package com.jhart;
//POJO
public class Student extends Person{
	//作用范围修饰符
	//private:类可见性   只在本类中可以使用，其他地方访问都是非法的
	//没有作用范围修饰符：包可见性   只有本包中可以使用，其他地方访问都是非法的
	//protected:子类可见性  只在本包或者其他包中的子类可以使用，其他地方访问都是非法的
	//public：公共访问级别  任何位置都可以访问
	//类的成员变量一般是private 这叫类的封装
	//如果要使用成员变量，使用public的getter setter方法
	protected String name;//姓名成员属性
	private int score;//成绩成员属性 
	//构造方法  修饰符public+类名(){}
	//无参数构造方法
	public Student() {}
	//有参数构造方法
	public Student(String mz,int cj) {
		this.name=mz;
		this.score=cj;
	}
	//读取姓名
	public String getName() {
		return name;
	}
	//设置姓名
	public void setName(String name/*参数名 随便什么都可以  如：nz*/) {
		this.name = name;//this.name = nz;
	}
	//读取成绩
	public int getScore() {
		return score;
	}
	//设置成绩
	public void setScore(int score) {
		this.score = score;
	}
	
}
