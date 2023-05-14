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

	// 브랜드		
	// 색상
	// 자격
	
	// 시동켜기(브랜드 시동 켜기)
	void engineStart() {
		System.out.println(this.brand + "시동 켜기");
	}
	
	// 시동끄기(브랜드 시동 끄기)
	void engineStop() {
		System.out.println(this.brand + "시동 끄기");
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
