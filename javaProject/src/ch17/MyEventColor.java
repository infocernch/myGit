package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyColor implements ActionListener {

	private JFrame f;
	private Color c;
	private Container con;
	
	public MyColor(JFrame f , Color c) {
		this.f=f;
		this.c=c;
		con = f.getContentPane();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
		
	}
	
}



public class MyEventColor extends JFrame{
	private JButton bt1,bt2,bt3,bt4,bt5;
	
	public MyEventColor() {
		
		
		bt1 = new JButton("North");
		bt2 = new JButton("South");
		bt3 = new JButton("East");
		bt4 = new JButton("West");
		
		
		add(bt1,"East");add(bt2,"West");
		add(bt3,"South");add(bt4,"North");
		
		
		
		bt1.addActionListener(new MyColor(this, Color.red));
		bt2.addActionListener(new MyColor(this, Color.blue));
		bt3.addActionListener(new MyColor(this, Color.green));
		bt4.addActionListener(new MyColor(this, Color.yellow));
		bt4.addActionListener(new MyColor(this, Color.yellow));
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MyEventColor();
	}
	
	
	
}
