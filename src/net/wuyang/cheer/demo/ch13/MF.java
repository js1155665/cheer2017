package net.wuyang.cheer.demo.ch13;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyJDialog extends JDialog { // ��������̳�JDialog��

	private static final long serialVersionUID = 1L;

	public MyJDialog(MF frame) {
		// ʵ����һ��JDialog�����ָ���Ի���ĸ����塢������������
		super(frame, "��һ��JDialog����", true);
		Container container = getContentPane(); // ����һ������
		container.add(new JLabel("���ǶԻ���")); // ����������ӱ�ǩ
		setBounds(120, 120, 100, 100); // ���öԻ������С
	}
}

public class MF extends JFrame { // ��������

	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		new MF(); // ʵ����MyJDialog�����
	}
	
	public MF() {
		Container container = getContentPane(); // ����һ������
		container.setLayout(null);
		JLabel jl = new JLabel("����һ��JFrame����"); // �ڴ��������ñ�ǩ
		// ����ǩ���������ڱ�ǩ�м�λ��
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("�����Ի���"); // ����һ����ť
		bl.setBounds(10, 10, 100, 21);
		bl.addActionListener(new ActionListener() { // Ϊ��ť�����굥���¼�
					public void actionPerformed(ActionEvent e) {
						// ʹMyJDialog����ɼ�
						new MyJDialog(MF.this).setVisible(true);
					}
				});
		container.add(bl); // ����ť��ӵ�������
		
		container.add(bl);
		container.setBackground(Color.white);
		setSize(200, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
