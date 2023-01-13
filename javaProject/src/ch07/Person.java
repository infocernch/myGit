package ch07;

public class Person {
	//멤버변수
	private String name;
	private int age;
	private double height;
	private String eMail;
	private String add;
	//setter : set + 변수명
	public void setName(String name) {//지역변수
		this.name = name ; //this =>멤버변수를 가리킴
	}
	//getter : get +변수명
	public String getName() {
		return name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age =age;
		}
	}
	public int getAge() {
		return age;
	}
	
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void print() {
		System.out.println("이름 : "+name+ "나이 : " + age + "키 : "+ height);
	}
	public void print1() {
		System.out.println("이름 : "+name+"\n"+ "나이 : " + age + "\n"+"이메일 : "+ eMail
				+"\n"+"주소 : "+add);
	}
}
