package com.ict.edu2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ex01_Componet extends JFrame implements ActionListener{
	public Ex01_Componet() {
		super ("버튼 이벤트");
	
	
	JPanel jp = new JPanel();
	
	JButton jb1 = new JButton();
	jb1.setText("첫번째");
	

	JButton jb2 = new JButton("두번째");
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new Ex01_Componet();
	}


	
}
