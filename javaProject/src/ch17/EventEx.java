package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트처리 3대요소: 이벤트소스, 이벤트처리기(클래스),이벤트리스너
public class EventEx extends Frame implements WindowListener{
	public EventEx() {
		addWindowListener(this);//(new..)해서 하지않고 WindowListener를
								//상속받아쓰면 (this)로도 사용가능
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventEx();
	}
	
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
