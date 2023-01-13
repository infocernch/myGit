package ch14;

import java.util.Scanner;

public class Product {
	private String num;//제품번호 
	private String product; //제품명
	private String com;//제조사 
	private int price;//단가 
	private int amount;//수량 
	private int money;//금액 
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("제품번호 :");
		num = sc.next();
		System.out.print("제품명 :");
		product = sc.next();
		System.out.print("제조사 :");
		com = sc.next();
		System.out.print("단가 :");
		price = sc.nextInt();
		System.out.print("수량 :");
		amount = sc.nextInt();
		
		money = price*amount;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	
	public Product(String num, String product, String com, int price, int amount, int money) {
		super();
		this.num = num;
		this.product = product;
		this.com = com;
		this.price = price;
		this.amount = amount;
		this.money = money;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	

	
	
	
}
