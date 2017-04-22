package net.wuyang.cheer.demo.ch09;

public class MathRondom {
      public static int GetEvenNum(double num1, double num2){
    	  int s = (int)num1+(int)(Math.random()*(num2-num1));
    	  if(s%2==0){
    		  return s;
    	  }else
    		  return s+1;
    	        }
      public static void main(String[] args){
    	  System.out.println("random even number between 2&32:"+ GetEvenNum(2,32) );
      }
}
