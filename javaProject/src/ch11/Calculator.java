package ch11;

public interface Calculator {
	public int plus(int i ,int j);
	public int multiple(int i , int j);
	default int exec (int i, int j) {//jdk 1.8부터 ㄱ ㅏ능
		return i+j;
	}
}
