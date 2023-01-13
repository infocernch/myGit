package ch16;

public class MyThread_Ex_Use {
	public static void main(String[] args) {
		MyThread_Ex m = new MyThread_Ex();
		MyThread_Ex m1 = new MyThread_Ex();
		
		m.setName("스레드1");
		m1.setName("스레드2");
		
		m.setPriority(Thread.MAX_PRIORITY);
		m1.setPriority(Thread.MIN_PRIORITY);
		
		m.start();
		m1.start();
		
		
		
		
	}
}
