package inheritanceTest;

class Car{
	String brand;
	String color;
	int price;
	
	public Car() {
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}

	void engineStop() {
		System.out.println("����� �õ� ��");
	}


}

class SuperCar extends Car{
	// �ڽ��� �θ��� �⺻�����ڸ� �θ���
	String mode;
	
// ����ī�� �������� �õ��� �Ѱ� �� �� �ִ�	


	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		super.engineStart(); // �θ� �״�� �� ���
		System.out.println("�õ� �ѱ�");
		
	}
	
	@Override
	void engineStop() {
		System.out.println("�õ� ����");
	}
}
public class InheritanceTask {

}
