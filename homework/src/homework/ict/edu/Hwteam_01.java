package homework.ict.edu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Hwteam_01 extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	JTextField id,name,add,phone,company,comtext;
	JTextArea jta;
	JPanel jp1,jp2,jp3,JP4;
	JComboBox<String> box;
	JTable table;
	
	public Hwteam_01() {
		super("DB 연동정보");
		
		jp1 = new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel t1 = new JPanel();
		//t1.setLayout();

		id = new JTextField(10);

		JLabel jl1 = new JLabel(("ID: "));
		jl1.setHorizontalAlignment(JLabel.CENTER);
		t1.add(id);

		name = new JTextField(10);
		t1.add(new JLabel("이름: "));
		t1.add(name);

		phone = new JTextField(10);
		t1.add(new JLabel("전화: "));
		t1.add(phone);

		add = new JTextField(10);
		t1.add(new JLabel("주소: "));
		t1.add(add);
		
		company = new JTextField(10);
		t1.add(new JLabel("회사: "));
		t1.add(company);
		
		jp1.add(t1, BorderLayout.WEST);
		
		jta = new JTextArea(20,0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jp2 = new JPanel();
		
		jb1 = new JButton("추가");
		jb2 = new JButton("삭제");
		jb3 = new JButton("수정");
		
		String[] items = {"ID","이름","전화","주소","회사"};
		box = new JComboBox<>(items);
		comtext = new JTextField(10);
		
		jb4 = new JButton("검색");
		jb5 = new JButton("지우기");
		jb6 = new JButton("전체보기");
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(box);
		jp2.add(comtext);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		
		jp3 = new JPanel();
		jp3.add(new JLabel("Address Book"));
		
		Ex01_JTable table = new Ex01_JTable();
		
		JTable jtable = new JTable(table);
		JScrollPane aaa = new JScrollPane(jtable);
		
		
		add(aaa, BorderLayout.CENTER);
		add(jp3, BorderLayout.NORTH);
		add(jp1, BorderLayout.WEST);
		add(jp2, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Hwteam_01();
	}
}
