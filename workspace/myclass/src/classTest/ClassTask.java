package classTest;

import java.util.Iterator;

class SuperCar{
	//브랜드, 색상, 가격
	//엔진 상태
	String brand;
	String color;
	int price;
	int wrongCount;
	boolean check;
	String password;
	
	
	// 생성자
	
	SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	 
	
	
	// 시동켜기
	// 엔진 상태를 확인하고
	// 시동이 꺼져있다면, "시동켜기"를 출력
	// 이미 시동이 켜져있다면, "시동이 이미 켜져 있습니다."를 출력
//	void engineStart(boolean check) {
//		if(check == true){
//			System.out.println("시동 켜기");
//		}else {
//			System.out.println("시동이 이미 켜져 있습니다.");
//		}
//		
//	}
//	boolean engineStart() {
//		if(check) {
//			return true;
//		}
//		return false;
//	}
	// return check ? false : true;
	
	// 시동 끄기
	// 엔진 상태를 확인하고
	// 시동이 켜져있다면, "시동 끄기" 출력
	// 이미 시동이 켜져있다면, "시동이 이미 꺼져 있습니다" 출력
//	void engineStop(boolean check) {
//		if(!check){
//			System.out.println("시동 끄기");
//		}else{
//			System.out.println("시동이 이미 꺼져 있습니다.");
//			}
//
//		}
//
//	}
//	boolean engineStop() {
//		if(!check) {
//			return true;
//		}
//		return false;
//	}
	// return check ? false : true;

	
	
// 시동을 켜기 위해서 비밀번호 4자리를 입력받아야 한다.
// 3번 연속을 잘못 입력했을시 "경찰 출동" 출력
// 문자열 비교는 ==이 아닌 equals()로 출력한다
// "문자열".equals("문자열")
	

	String engineStartPw(String pw) {
		String result = "시동 켜기";
		if(!password.equals(pw)){
			for (int i = 0; i <.length; i++) {
				
			}
			
		}
		return result;
		
		
	}

}
public class ClassTask {
	public static void main(String[] args) {
		SuperCar mycar = new SuperCar("Hyundae", "White", 1000);
		
//		mycar.engineStart();
//		mycar.engineStart();
//		
//		mycar.engineStop();
//		mycar.engineStop();
	
	}
}


