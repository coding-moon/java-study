package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "������"; 
		int age = 20;
		double height = 123.5;
		      
		//system.out.printf(���Ĺ���, ������)
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d", age);
		System.out.printf("������ : %.2fkg\n", height); // �ݿø�       
	}

}
