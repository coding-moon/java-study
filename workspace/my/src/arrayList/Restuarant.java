package arrayList;

import java.util.ArrayList;

public class Restuarant {
	
	ArrayList<Food> foods = DBconnecterR.foods;
	
// �����߰�
	public void add(Food food) {
		foods.add(food);
	}

	//���� �̸����� ���� ��ȸ
	public String findByName(String name) {
		for(Food food : foods) {
			if(food.getName().equals(name)) {
				return  food.getKind();
			}
		}
		return null;
	}

//  ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<Food> findBykind(String kind) {
		for(Food food : foods) {
			if(food.getKind().equals(kind)) {
				return foods;
			}
		}
		return null;
	}

// ���� ���� ���� �� ���� 10% ���
	public void changeKinds(String kind) {
		  //(double)food.getPrice() += food.getPrice() * 0.1;
		for(Food food : foods) {
			foods.set(n, kind);
			
		}
			
				
				//food.set(food.getPrice(), (double)food.getPrice() = food.getPrice() *0.1 );
	
		}
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
