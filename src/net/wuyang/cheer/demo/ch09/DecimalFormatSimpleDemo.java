package net.wuyang.cheer.demo.ch09;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {

	 static public void SimgleFormat(String pattern, double value) {
		 DecimalFormat myFormat = new DecimalFormat(pattern);
		 String output= myFormat.format(value);
		 System.out.println(value+""+pattern+""+output);
		

	}
	 static public void UseApplyPatternMethodFormat(String pattern, double value){
		 DecimalFormat myFormat=new DecimalFormat();
		 myFormat.applyPattern(pattern);
		 System.out.println(value+""+pattern+""+myFormat.format(value));
	 }
	 
	 public static void main(String[] args){
		 SimgleFormat("###,###.###", 123456.789);
		 SimgleFormat("00000000.###kg", 123456.789);
		 SimgleFormat("000000.000", 123.78);
		 UseApplyPatternMethodFormat("#.###%", 0.789);
		 UseApplyPatternMethodFormat("###.##", 123456.789);
		 UseApplyPatternMethodFormat("0.00\u2030", 0.789);
	 }

}
