package object;

public class HashcodeTest {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		
		System.out.println(data1); // toString(): 생략됨, String 클래스에서 오버라이딩(재정의됨)
									// String 클래스 사용시 자동으로 호출됨, Object 주소값 출력, String 에서는 값이 출력됨
		
									
		System.out.println(data2);
		System.out.println(data1.toString());
		System.out.println(data2.toString());
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
	

	Object obj = new Object();
		System.out.println(obj.toString());
		
	
	
	}
}
