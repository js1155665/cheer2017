package net.wuyang.cheer.demo.ch11;

import java.util.Random;
import static java.lang.System.out;

public class FinalStaticData {
	private static Random rand=new Random();
	private final int a1= rand.nextInt(10);
	private static final int a2= rand.nextInt(10);
public static void main(String[] args){
	FinalStaticData fdata= new FinalStaticData();
	out.println("resample object a1:" +fdata.a1);
	out.println("resample object a1:" +fdata.a2);
	FinalStaticData fdata2= new FinalStaticData();
	out.println("resample object a1:"+ fdata2.a1);
	out.println("resample object a2:"+ fdata2.a2);
}

}
