package com.leimingyinyongfangfa;
@FunctionalInterface
interface Printable{
	void print(StringUtils su, String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E27 {

	public static void main(String[] args) {
		printUpper(new StringUtils(),"Hello",(Object, t) ->Object.printUpperCase(t));
		printUpper(new StringUtils(),"Hello",StringUtils::printUpperCase);
	}

	private static void printUpper(StringUtils su, String text, Printable pt) {
		pt.print(su,text);
		
	}

}
