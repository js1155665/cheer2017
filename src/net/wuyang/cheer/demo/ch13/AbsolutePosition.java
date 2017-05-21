package net.wuyang.cheer.demo.ch13;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AbsolutePosition extends JFrame{
	public AbsolutePosition(){
		setTitle("thisWindowUseAbsolutePosition");
		setLayout(null);
		setBounds(0,0,200,150);
		Container c =getContentPane();
		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		b1.setBounds(10,30,80,30);
		b2.setBounds(60,70,100,20);
		c.add(b1);
		c.add(b2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
	public static void main(String[] args){
		new AbsolutePosition();
	}

}
