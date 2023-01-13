package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//JApplet은 Applet의 확장판으로 애플릿뷰어나 웹브라우저와 함께 쓰였으며
//게임 및 다양한 그래픽을 구사할 수 있다. 현재 HTML5등 웹이 진화되면서 거의 사라져감..
//라이프사이클을 가지고있다. init() - start() - stop() - destroy()
//init()은 필수처리이며 나머지는 자동으로 처리되며 특정 웹브라우저의 페이지이동 및 강제종료시킬때 간혹 쓰임.
public class StringLine extends JApplet {
	@Override
	public void init() {//애플릿 초기화하는 코드
		getContentPane().setBackground(new Color(255,255,255));//배경색상 설정
		setSize(300,300);//애플릿의 화면 사이즈 설정
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);//색상설정
		g.drawLine(205, 50, 30, 160);//선그리기 drawLine(x1,y1,x2,y2)
		g.setColor(Color.red);
		g.drawString("Red String", 10, 50);
		g.setColor(Color.cyan);
		g.drawString("Cyan String", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue String", 10, 110);
		
		
	}
}
