package net.wuyang.cheer.sample.ch11;
interface OutInterface{
	public void f();
}

public class InterfaceInner {
   public static void main(String args[]){
	   OuterClass2 out= new OuterClass2();
	   OutInterface outinter=out.doit();
	   outinter.f();
	   }
}
class OuterClass2{
	private class InnerClass implements OutInterface{
		InnerClass(String s){
			System.out.println(s);
		}
		public void f(){
			System.out.println("access to interface f()class");
			
		}
	}
	public OutInterface doit(){
		return new InnerClass("the method of accessing to interface calss");
	}
}