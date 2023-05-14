package arrayList;

import java.util.ArrayList;

public class Restuarant {
	
	ArrayList<Food> foods = DBconnecterR.foods;
	
// 음식추가
	public void add(Food food) {
		foods.add(food);
	}

	//음식 이름으로 종류 조회
	public String findByName(String name) {
		for(Food food : foods) {
			if(food.getName().equals(name)) {
				return  food.getKind();
			}
		}
		return null;
	}

//  사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<Food> findBykind(String kind) {
		for(Food food : foods) {
			if(food.getKind().equals(kind)) {
				return foods;
			}
		}
		return null;
	}

// 음식 종류 수정 후 가격 10% 상승
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
