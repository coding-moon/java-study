package classTest;


class Car{
	String brand;
	String color;
	int price;
		
		Car(String brand, String color, int price){
			this.brand = brand;
			this.color = color;
			this.price = price;
		}
		
		Car( String color, int price) {
			this.color = color;
			this.price = price;
		}

	// �귣��		
	// ����
	// �ڰ�
	
	// �õ��ѱ�(�귣�� �õ� �ѱ�)
	void engineStart() {
		System.out.println(this.brand + "�õ� �ѱ�");
	}
	
	// �õ�����(�귣�� �õ� ����)
	void engineStop() {
		System.out.println(this.brand + "�õ� ����");
	}

}

public class Road {
	public static void main(String[] args) {
		Car mycar = new Car("KIA", "Black", 1000);
		Car momcar = new Car("KIA", "Black", 1000);
		Car dadycar = new Car("Black", 1000);
		
		mycar.engineStart();
		mycar.engineStop();
		
		momcar.engineStart();
		momcar.engineStop();
		
		dadycar.engineStart();
		dadycar.engineStop();

	}

}
