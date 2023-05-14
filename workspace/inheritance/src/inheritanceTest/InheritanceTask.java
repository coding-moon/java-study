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
		System.out.println("열쇠로 시동 킴");
	}

	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}


}

class SuperCar extends Car{
	// 자식은 부모의 기본생성자만 부른다
	String mode;
	
// 슈퍼카는 음성으로 시동을 켜고 끌 수 있다	


	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		super.engineStart(); // 부모꺼 그대로 쓸 경우
		System.out.println("시동 켜기");
		
	}
	
	@Override
	void engineStop() {
		System.out.println("시동 끄기");
	}
}
public class InheritanceTask {

}
