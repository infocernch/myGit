package ch17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pizza extends JFrame {
	public Pizza() {
		super("피자 메뉴");
		setSize(500, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel1.setBackground(Color.BLUE);
		panel2.setBackground(Color.CYAN);
		panel3.setBackground(Color.GREEN);
		
		JLabel label = new JLabel("피자 종류를 선택하세요.");
		panel2.add(label);
		
		JButton btn1 = new JButton("치즈");
		JButton btn2 = new JButton("불고기");
		JButton btn3 = new JButton("포테이토");
		JButton btn4 = new JButton("종료");
		
		//panel3 에 버튼추가
		panel3.add(btn1);
		panel3.add(btn2);
		panel3.add(btn3);
		panel3.add(btn4);
		
		//panel에 다른패널 추가
		panel1.add(panel2);
		panel1.add(panel3);
		
		add(panel1,"North");
		setVisible(true);
		
		ActionListener handler = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("치즈")) {
					JOptionPane.showMessageDialog(null, 
							"치즈피자를 선택하셨습니다,\n가격:23,000dnjs","치즈피자",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("불고기")) {
					JOptionPane.showMessageDialog(null, 
							"불고기피자를 선택하셨습니다,\n가격:25,000dnjs","불고기피자",
							JOptionPane.WARNING_MESSAGE);
				}else if(e.getActionCommand().equals("포테이토")) {
					JOptionPane.showMessageDialog(null, 
							"포테이토피자를 선택하셨습니다,\n가격:20,000dnjs","포테이토피자",
							JOptionPane.DEFAULT_OPTION);
			}else if(e.getActionCommand().equals("종료")) {
				JOptionPane.showMessageDialog(null, 
						"프로그램을 정말 종료하시겠습니까?","종료",
						JOptionPane.OK_CANCEL_OPTION);
			}
		}		
	};
		//버튼에 리스너 부착
		btn1.addActionListener(handler);
		btn2.addActionListener(handler);
		btn3.addActionListener(handler);
		btn4.addActionListener(handler);
		
		
		
		}
	public static void main(String[] args) {
		new Pizza();
	}
}

