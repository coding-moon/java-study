package classTest;

import java.util.Iterator;

class SuperCar{
	//�귣��, ����, ����
	//���� ����
	String brand;
	String color;
	int price;
	int wrongCount;
	boolean check;
	String password;
	
	
	// ������
	
	SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	 
	
	
	// �õ��ѱ�
	// ���� ���¸� Ȯ���ϰ�
	// �õ��� �����ִٸ�, "�õ��ѱ�"�� ���
	// �̹� �õ��� �����ִٸ�, "�õ��� �̹� ���� �ֽ��ϴ�."�� ���
//	void engineStart(boolean check) {
//		if(check == true){
//			System.out.println("�õ� �ѱ�");
//		}else {
//			System.out.println("�õ��� �̹� ���� �ֽ��ϴ�.");
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
	
	// �õ� ����
	// ���� ���¸� Ȯ���ϰ�
	// �õ��� �����ִٸ�, "�õ� ����" ���
	// �̹� �õ��� �����ִٸ�, "�õ��� �̹� ���� �ֽ��ϴ�" ���
//	void engineStop(boolean check) {
//		if(!check){
//			System.out.println("�õ� ����");
//		}else{
//			System.out.println("�õ��� �̹� ���� �ֽ��ϴ�.");
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

	
	
// �õ��� �ѱ� ���ؼ� ��й�ȣ 4�ڸ��� �Է¹޾ƾ� �Ѵ�.
// 3�� ������ �߸� �Է������� "���� �⵿" ���
// ���ڿ� �񱳴� ==�� �ƴ� equals()�� ����Ѵ�
// "���ڿ�".equals("���ڿ�")
	

	String engineStartPw(String pw) {
		String result = "�õ� �ѱ�";
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


