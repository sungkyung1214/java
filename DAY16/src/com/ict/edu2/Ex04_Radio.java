package com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex04_Radio extends JFrame{
	public Ex04_Radio() {
	super("라디오버튼");
	
	JPanel jp = new JPanel();//패널은 보이기 위한 장치
	
	JRadioButton jrb1 = new JRadioButton();
	jrb1.setText("야구");
	jrb1.setSelected(true);
	
	
	JRadioButton jrb2 = new JRadioButton("축구",true);
	JRadioButton jrb3 = new JRadioButton("농구");
	JRadioButton jrb4 = new JRadioButton("배구");
	
	// 라디오 버튼은 체크박스와 다르게 여러개 중 하나만 선택되어야 한다.
	// 그러기 위해서는 반드시 라디오버튼을 ButtonGroup 에 넣어라
	
	ButtonGroup bg = new ButtonGroup();
	bg.add(jrb1);
	bg.add(jrb2);
	bg.add(jrb3);
	bg.add(jrb4);
	// 버튼 그룹 끝!
	
	jp.add(jrb1);
	jp.add(jrb2);
	jp.add(jrb3);
	jp.add(jrb4);
	
	add(jp);
	
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}


	public static void main(String[] args) {
		new Ex04_Radio();
	}
}
