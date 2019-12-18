package com.inner_class;
//定义一个函数式接口
@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public Person(String name) {
		this.name = name;
	}
}
public class E26 {

	public static void main(String[] args) {
		PrinterName("郭富城",new PersonBuilder() {

			@Override
			public Person buildPerson(String name) {
				// TODO 自动生成的方法存根
				return new Person(name);
			}
			
		});
		PrinterName("张学友",name->new Person(name));
		PrinterName("刘德华",Person::new);
	}

	private static void PrinterName(String name, PersonBuilder pb) {
		System.out.println(pb.buildPerson(name).getName());
		
	}

}
