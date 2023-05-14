package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) {
	// ��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ�̸�, ��ǰ ����, ��ǰ ���)
	// 1. ��ǰ 1���� �����Ͽ� JSON �������� ����
		Product product = new Product(1, "����", 5000, 8);		
		JSONObject proJSON = new JSONObject(product);
				
	// 2. JSON������ ��ǰ ���� �� ��ǰ ��� ���
		try {
			System.out.println(proJSON.get("account"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	// 3. ���� ���� ��ǰ�� ���� ����	
		Product product1 = new Product(2, "�Ե�����",1000, 8);
		// 5. JSON�������� ����	
		JSONObject proJSON1 = new JSONObject(product1);
		// 4. ���� ���� ��ǰ�� KEY���� "discount"�� ����
		try {
			proJSON.put("discount", proJSON1);
			System.out.println(proJSON.put("discount", proJSON1));
		} catch(JSONException e) {
			e.printStackTrace();	
		}
		
		// 6. JSON������ �ʵ� �߰�
		// 7. JSON������ ��ǰ ���� �� ������ ���
		try {
		  proJSON1.put("sale", 0.3);
		  System.out.println(proJSON1.get("sale"));
	  } catch (JSONException e) {
		e.printStackTrace();
	  }
	
	
	}
	
}
