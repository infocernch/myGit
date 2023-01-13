package ch14;

public class Member {
	private String userid;
	private String passwd;
	private String name;
	private String tel;
	private String eamil;
//	getter,setter, 생성자2개
	public Member() {
	
	}
	public Member(String userid, String passwd, String name, String tel, String eamil) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.tel = tel;
		this.eamil = eamil;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	
	
}
