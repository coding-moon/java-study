package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "문은서"; 
		int age = 20;
		double height = 123.5;
		      
		//system.out.printf(서식문자, 변수명)
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d", age);
		System.out.printf("몸무게 : %.2fkg\n", height); // 반올림       
	}

}
