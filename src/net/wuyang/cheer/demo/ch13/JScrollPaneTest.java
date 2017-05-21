package net.wuyang.cheer.demo.ch13;

import java.awt.Container;

import javax.swing.*;
public class JScrollPaneTest extends JFrame {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public JScrollPaneTest(){
	   Container c= getContentPane();
	   JTextArea ta=new JTextArea(20,50);
	   JScrollPane sp=new JScrollPane(ta);
	   c.add(sp);
	   setTitle("with Scroll Text Editor");
	   setSize(200,200);
	   setVisible(true);
	   setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
   }
   public static void main(String[] args){
	   new JScrollPaneTest();
   }
}
