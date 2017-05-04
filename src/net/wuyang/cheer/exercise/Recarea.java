package net.wuyang.cheer.exercise;

public class Recarea {
	private float height;
	private float width;
	public Recarea(float height,float width){
		this.height=height;
		this.width=width;
	}
	public float square(){
		return height*width;
	}
	public static void main(String args[]){
		Recarea u=new Recarea(3.5f,4.5f);
		System.out.println(u.square());
	}
}
