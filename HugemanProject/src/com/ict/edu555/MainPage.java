package com.ict.edu555;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MainPage extends JFrame {
	JButton point_bt, book_bt, attend_bt;
	JPanel main, first, second, second1,second2, last;
	JTextArea notice, class_notice;
	GridBagConstraints constraints;

	public MainPage() {
		super("메인화면");

		main = new JPanel();
		main.setLayout(new BorderLayout());

		first = new JPanel();
//		first.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
		notice = new JTextArea(10, 39);
		notice.setLineWrap(true); // 자동 줄 바꿈 jta 는 무조건 jscrollpane 과 짝궁
		notice.setEditable(false);
		JScrollPane jsp = new JScrollPane(notice, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		first.add(new JLabel(" 공  지  사  항 "));
		first.add(notice);

		second = new JPanel(new GridBagLayout());//패널과 패널을 붙일 때, 중앙에 오게하는 메서드 
		
		

		
		second2 = new JPanel();
		second2.setLayout(new GridLayout(0, 1)); // 2x2 그리드 레이아웃 사용
		second2.setPreferredSize(new Dimension(400, 100));
		second2.setBackground(Color.WHITE);
//		second2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JLabel label = new JLabel("알림제목");
		JLabel label2 = new JLabel("알림 내용");
		JLabel label3 = new JLabel("알림 발생 시간");
//		second.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		second2.add(label);
		second2.add(label2);
		second2.add(label3);
		
		second.add(second2, constraints);

		
		
		
		
		
		
		
		last = new JPanel(new FlowLayout(FlowLayout.CENTER, 150, 20));

//		last.setBackground(Color.WHITE);
		last.setPreferredSize(new Dimension(50, 350));
		point_bt = new JButton(" 포인트 충전 ");
		point_bt.setPreferredSize(new Dimension(200, 50));
		book_bt = new JButton(" 수업 예약 ");
		book_bt.setPreferredSize(new Dimension(200, 50));
		attend_bt = new JButton(" 출결 체크 ");
		attend_bt.setPreferredSize(new Dimension(200, 50));

		last.add(point_bt, BorderLayout.NORTH);
		last.add(book_bt, BorderLayout.CENTER);
		last.add(attend_bt, BorderLayout.SOUTH);

		main.add(first, new BorderLayout().NORTH);
		main.add(second, new BorderLayout().CENTER);
		main.add(last, new BorderLayout().SOUTH);

		add(main);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 800);
		setLocationRelativeTo(null);
		setResizable(true);

	}

	public static void main(String[] args) {
		try {
			// UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			new MainPage();
		} catch (Exception e) {
		}

	}

}
