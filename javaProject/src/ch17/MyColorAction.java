package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener{
	private JFrame f;
	private Color c;
	private Container con;
//	Component : 화면구성요소(프레임, 버튼, 패널, ...)
//	Container : 다른 컴퍼넌트를 담을 수 있는 요소
//	contentPane : 스윙에서는 contentPane에 컴퍼턴트를 부착할수 있는데, contentPane은
//	JFrame객체가 처음 생길때 자동으로 생성되며, getContenPane()메소드로 사용해 얻을수 있다.
	
	public MyColorAction(JFrame f , Color c) {
		this.f = f;
		con=f.getContentPane();//프레임컨텐츠 영역으로 활용
		this.c=c;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상 변경
	}

}
