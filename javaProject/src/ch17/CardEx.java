package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardEx extends JFrame{
	CardLayout card;
	Container con;
	
	public CardEx() {
		super("CardLayout 예제");
		card = new CardLayout();
		con = getContentPane();//프레임의 컨텐츠 영역
		setLayout(card);//카드 레이아웃으로 변경
		JPanel[] pan = new JPanel[5];//패널배열생성
		Color[] color = {Color.red, Color.yellow, Color.green,
				Color.blue,Color.cyan};
		
		for(int i =0;i<pan.length;i++) {
			pan[i]= new JPanel();//패널생성
			pan[i].setBackground(color[i]);//패널의 배경색 설정
			add("card"+i, pan[i]);
			//패널에 마우스 이벤트추가
			pan[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//					card.next(con);//다음화면으로 이동
					card.previous(con);//이전화면으로 이동
				}
			});
			setSize(300, 300);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	public static void main(String[] args) {
		new CardEx();
	}
}
