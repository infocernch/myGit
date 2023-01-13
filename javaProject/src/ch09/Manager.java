package ch09;

public class Manager extends Employee {
	private double bonus;
	

	@Override
	public void input(int num, String rrn, String name, String adress,
					String email, int salary) {
		super.input(num, rrn, name, adress, email, salary);
	}
	
	public void cal() {
		bonus = salary * 0.3;
	}
	
	public void print() {
		System.out.println("사번 : "+getNum()+"\n"+"이름 : "+name+"\n"+
	"주소 : "+adress+"\n"+"이메일 : "+email+"\n"+"주민번호 : "+getRrn()+"\n"
	+"연봉 : "+salary+"\n"+"보너스 :"+bonus);
	}
	 
	}

