package net.wuyang.cheer.demo.ch08;

public class Charac {

	public static void main(String[] args) {
		String str= Integer.toString(456);
		String str2= Integer.toBinaryString(456);
		String str3= Integer.toHexString(456);
		String str4= Integer.toOctalString(456);
		System.out.println("456's string number:" + str);
		System.out.println("456's binary number:" + str2);
		System.out.println("456's hex number:" + str3);
		System.out.println("456's octal number:" + str4);
	}

}
