package object;

public class HashcodeTest {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		
		System.out.println(data1); // toString(): ������, String Ŭ�������� �������̵�(�����ǵ�)
									// String Ŭ���� ���� �ڵ����� ȣ���, Object �ּҰ� ���, String ������ ���� ��µ�
		
									
		System.out.println(data2);
		System.out.println(data1.toString());
		System.out.println(data2.toString());
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
	

	Object obj = new Object();
		System.out.println(obj.toString());
		
	
	
	}
}
