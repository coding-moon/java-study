package classTest;

class Company{
	static Long sequence;
	static Long total;
	
	Long id; // null이라는 값도 들어갈 수 있게 하기 위해
	String name;
	Long salary; 
	int income;
	
	static {
		sequence = 0L;
	}
	
	{
		id = sequence++;// 초기화 블록, 생성자가 호출될 때마다 초기화 블록이 만들어짐
	}
	
	public Company( String name, Long salary) {
		this.name = name;
		this.salary = salary;
		
	}

	public Company(Long id, String name, Long salary ) {
		
	}
	
	void printMyData() {
		System.out.println(id + ", " + name + ", 연" + salary + "만원" );
	}
}

public class Market {
		public static void main(String[] args) {
			Company 문은서 =  new Company("문은서", 4000L);
			Company 김종열 =  new Company("김종열", 6000L);
			Company 김유찬 =  new Company("김유찬", 7000L);
			Company 박정호 =  new Company("박정호", 10000L);
	
			문은서.printMyData();
			김종열.printMyData();
			김유찬.printMyData();
			박정호.printMyData();

			Company.total += 문은서.income = 1000; //
			Company.total += 김종열.income = 2000;
			Company.total += 김유찬.income = -10000;
			Company.total += 박정호.income = -20000;
		
		}
}
