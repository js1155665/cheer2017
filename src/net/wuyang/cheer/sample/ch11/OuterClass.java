package net.wuyang.cheer.sample.ch11;

innerClass in=new innerClass();
public void ouf(){
	in.inf();
}
class innerClass{
	innerClass(){
	}
public void inf(){
}
int y=0;
}
public innerClass doit(){
	in.y=4;
	return new innerClass();
	
}
public static void main(String args[]){
	OuterClass out=new OuterClass();
	OuterClass.innerClass in=out.doit();
	OuterClass.innerClass in2=out.new innerClass();
}
}

