package classTest;

class Company{
	static Long sequence;
	static Long total;
	
	Long id; // null�̶�� ���� �� �� �ְ� �ϱ� ����
	String name;
	Long salary; 
	int income;
	
	static {
		sequence = 0L;
	}
	
	{
		id = sequence++;// �ʱ�ȭ ���, �����ڰ� ȣ��� ������ �ʱ�ȭ ����� �������
	}
	
	public Company( String name, Long salary) {
		this.name = name;
		this.salary = salary;
		
	}

	public Company(Long id, String name, Long salary ) {
		
	}
	
	void printMyData() {
		System.out.println(id + ", " + name + ", ��" + salary + "����" );
	}
}

public class Market {
		public static void main(String[] args) {
			Company ������ =  new Company("������", 4000L);
			Company ������ =  new Company("������", 6000L);
			Company ������ =  new Company("������", 7000L);
			Company ����ȣ =  new Company("����ȣ", 10000L);
	
			������.printMyData();
			������.printMyData();
			������.printMyData();
			����ȣ.printMyData();

			Company.total += ������.income = 1000; //
			Company.total += ������.income = 2000;
			Company.total += ������.income = -10000;
			Company.total += ����ȣ.income = -20000;
		
		}
}
