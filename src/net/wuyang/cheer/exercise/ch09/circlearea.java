package net.wuyang.cheer.exercise.ch09;

import java.text.*;

public class circlearea {
	static public void SimpleFormat(String pattern, double value) {	//ʹ��ʵ��������ʱ���ø�ʽ��ģʽ
		DecimalFormat myFormat = new DecimalFormat(pattern);	//ʵ����DecimalFormat����
		String output = myFormat.format(value);				//�����ֽ��и�ʽ��
		System.out.println(value + " " + pattern + " " + output);
	} 
	public static double Getcirclearea(double r){
		return Math.PI*Math.pow(r, 2);
	}
	public static void main(String[] args) {
		System.out.print("Բ�����Ϊ��");
		SimpleFormat("#.#####",Getcirclearea(4));
	}

}