package ch14;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> m = new HashMap<>();
		List<Ec> list = new ArrayList<Ec>();
		
		list.add(new Ec(1234, "2023-01-04", "하이트맥주", "삼성", "37918123468", 55900));
		list.add(new Ec(2345, "2022-12-12", "꼬깔콘", "롯데", "35691567845", 23600));
		list.add(new Ec(3456, "2023-01-01", "노트북", "현대", "36160567882", 2600000));
		
		m.put("list", list);
		print(m);
	}
	
static public void print(Map<String, Object> m) {
	
	DecimalFormat dec = new DecimalFormat("###,###");
	@SuppressWarnings("unchecked")
	ArrayList<Ec> list2 = (ArrayList<Ec>)m.get("list");
	System.out.println("------------------------------------------");
	System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
	System.out.println("------------------------------------------");
	for(Ec e : list2 ) {
		System.out.println(e.getNo()+"\t"+e.getOrderDate()+"\t"+e.getProduct()+"\t"+e.getCardName()+"\t"
				+e.getCardNo()+"\t"+dec.format(e.getPay()));
		}
	
}

}
