package net.wuyang.cheer.sample.ch12;

public class shoot {
	static void pop() throws NegativeArraySizeException{
		int[] arr= new int[-3];
	}
	public static void main(String[] args){
		try{
			pop();
		}catch (NegativeArraySizeException e){
			System.out.println("pop()methodthrowsException");
		}
		
	}

}
