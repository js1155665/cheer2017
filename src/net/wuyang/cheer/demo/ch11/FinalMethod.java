package net.wuyang.cheer.demo.ch11;

class Parents{
	private final void doit(){
		System.out.println("fatherclass.doit()");
	}
		final void doit2(){
			System.out.println("fatherclass.doit2()");
		}
		public void doit3(){
			System.out.println("fatherclass.doit3()");
		}
		}
class Sub extends Parents{
	public final void doit(){
		System.out.print("daughterclass.doit()");
	}
	public void doit3(){
		System.out.println("daughterclass.doit3()");
	}
}
public class FinalMethod {
	public static void main(String[] args){
		Sub s=new Sub();
		s.doit();
		Parents p=s;
		p.doit2();
		p.doit3();
	}

}
