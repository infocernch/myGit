package ch08;

public class Member {
	private String name;
	private String userId;
	private int money;
	private String grade;
	
	public Member(String name,String userId,int money) {
		this.name = name;
		this.userId = userId;
		this.money = money;
	}
	public Member() {
	
}
	public String getGrade() {
		if(money >= 100000) {
			grade = "gold";
		}else{
			grade = "silver";
		}
		return grade;
	}

	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userId+"\t"+money+"\t"+getGrade());
	}
	
	
}
