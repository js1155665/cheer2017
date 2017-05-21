package net.wuyang.cheer.demo.ch13;

import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyImageIcon extends JFrame{
public MyImageIcon(){
	Container container=getContentPane();
	JLabel jl=new JLabel("thisisaJFrameWindow",JLabel.CENTER);
	URL url=MyImageIcon.class.getResource("imageButton.jpg");
	Icon icon=new ImageIcon(url);
	jl.setIcon(icon);
	jl.setHorizontalAlignment(SwingConstants.CENTER);
	jl.setOpaque(true);
	container.add(jl);
	setSize(250,100);
	setVisible(true);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}

public static void main(String args[]){
	new MyImageIcon();
}
}
