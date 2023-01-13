package pr;

public class Money {
	public static final String UNIT = "원";
	private int money;
	
	

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getUNIT() {
		return UNIT;
	}
	
	public void print() {
		System.out.println(money + UNIT+ "이 있습니다.");
	}
	
}
