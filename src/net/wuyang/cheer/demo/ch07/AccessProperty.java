package net.wuyang.cheer.demo.ch07;

public class AccessProperty {
    static int i=47;
    public void call(){
    	System.out.println("call()method");
    	for(i=0;i<3;i++){
    		System.out.print(i+"");
    		if (i==2){
    			System.out.println("\n");
    		}
    	}
    }
    public AccessProperty(){
    	    }
	public static void main(String[] args) {
		AccessProperty t1 = new AccessProperty();
		AccessProperty t2 = new AccessProperty();
        t2.i=60;
        System.out.println("firstobjectvaluei:"+t1.i++);
        t1.call();
        System.out.println("secondobjectvaluei:"+t1.i++);
        t2.call();
	}

}
