package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) {
	// 상품 클래스 선언(상품 번호, 상품이름, 상품 가격, 상품 재고)
	// 1. 상품 1개를 제작하여 JSON 형식으로 변경
		Product product = new Product(1, "과자", 5000, 8);		
		JSONObject proJSON = new JSONObject(product);
				
	// 2. JSON형식의 상품 정보 중 상품 재고 출력
		try {
			System.out.println(proJSON.get("account"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	// 3. 할인 중인 상품의 정보 제작	
		Product product1 = new Product(2, "롯데샌드",1000, 8);
		// 5. JSON형식으로 변경	
		JSONObject proJSON1 = new JSONObject(product1);
		// 4. 할인 중인 상품의 KEY값은 "discount"로 설정
		try {
			proJSON.put("discount", proJSON1);
			System.out.println(proJSON.put("discount", proJSON1));
		} catch(JSONException e) {
			e.printStackTrace();	
		}
		
		// 6. JSON할인율 필드 추가
		// 7. JSON형식의 상품 정보 중 할인율 출력
		try {
		  proJSON1.put("sale", 0.3);
		  System.out.println(proJSON1.get("sale"));
	  } catch (JSONException e) {
		e.printStackTrace();
	  }
	
	
	}
	
}
