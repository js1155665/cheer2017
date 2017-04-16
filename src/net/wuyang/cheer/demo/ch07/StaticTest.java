package net.wuyang.cheer.demo.ch07;

public class StaticTest {
	final static double Pl=3.1415;
	static int id;
	public static void method1(){
		
	}
    public void mehod2(){
    	System.out.println(StaticTest.Pl);
    	System.out.println(StaticTest.id);
    	StaticTest.method1();
    }
}
