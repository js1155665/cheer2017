package net.wuyang.cheer.demo.ch13;
import java.awt.*;
import javax.swing.*;
public class Example1 extends JFrame{
	public void CreateJFrame(String title){
	JFrame jf= new JFrame(title);
	Container container=jf.getContentPane();
	JLabel jl=new JLabel("This is a window of JFrame");
	jl.setHorizontalAlignment(SwingConstants.CENTER);
    container.add(jl);
    container.setBackground(Color.white);
    jf.setVisible(true);
    jf.setSize(400,300);
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
public static void main(String args[]){
	new Example1().CreateJFrame("createaJFramewindow");
}
}