package net.wuyang.cheer.sample.ch12;

public class MyException extends Exception{
	String message;
	public MyException(String ErrorMessage){
		message=ErrorMessage;
	}
		public String getMessage(){
			return message;
	}

}
