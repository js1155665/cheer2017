package net.wuyang.cheer.demo.ch13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition(){
		setTitle("thiswindow use flow layout");
		Container c =getContentPane();
		setLayout(new FlowLayout(2,10,10));
		for (int i=0;i<10;i++){
			c.add(new JButton("button"+i));
		}
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			}
    public static void main(String[] args){
    	new FlowLayoutPosition();
    }
}
