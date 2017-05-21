package net.wuyang.cheer.sample.ch12;

public class Captor {
static int quotient(int x,int y)throws MyException{
	if(y<0){
		throw new MyException("dividercannotbeNagative");
	}
	return x/y;
	}
public static void main(String args[]){
	try{
		int result=quotient(3,-1);
	}catch (MyException e){
		System.out.println(e.getMessage());
	}catch (ArithmeticException e){
		System.out.println("dividercannotbeZero");
			}catch (Exception e){
				System.out.println("otherabnormalhappen");
			}	
}
}
