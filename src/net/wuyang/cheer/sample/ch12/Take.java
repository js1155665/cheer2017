package net.wuyang.cheer.sample.ch12;

public class Take {
public static void main(String[] args){
	try {
		String str="lili";
		System.out.println(str+"age is:");
		int age=Integer.parseInt("20L");
		System.out.println(age);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("program over");
}
}
