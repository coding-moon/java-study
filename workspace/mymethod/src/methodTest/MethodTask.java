package methodTest;

public class MethodTask {
	// 1~10���� println()���� ����ϴ� �޼ҵ�
//	void number(){
//		for (int i = 0; i < 9; i++) {
//			System.out.println(i + 1);
//		}
//		
//	}
	// "ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	// �̸��� n�� println()���� ����ϴ� �޼ҵ�
	// �� ������ ������ ���ִ� �޼ҵ�

//  1~n������ ���� �����ִ� �޼ҵ�
	int addFrom1(int end) {
		int sum = 0;
		for (int i = 0; i < end; i++) {
			sum += i + 1;
		} 
		return sum;
	}
	
	
//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	 int change(int count) {
		 return ++count; // ���� �� ������ ����
	 }
	 
//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ� �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
	String strUpperorLower(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); // charAt(): String���� ����� ���ڿ� �� �� �ϳ��� �ε�����(�ּҰ���) ã�� �� ���� ���ڸ� ���
			if(c >= 65 && c <= 90 ) {
				result += (char)(c + 32); // String + char = String?
				
				}else if(c >= 97 && c <= 122){
					result += (char)(c -32);
				
				}else{
					result += c;
				}								
			}
			return result;
	}
	
	 
//	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ� 
	int getCount(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
			count++;
			}		
		}
		return count;
	}
	
//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	int getValue(int[] arData, int index){
		return arData[index];
	}
//  �ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
	change(String hangle){
		String hangleOrigin = "���̻�����ĥ�ȱ�";
		
		
	}
	
//  5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//  5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)

// indexOf()�����
// ���ڿ��� ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ� �� �˻��ϰ�
// ���� �ش� ���ڰ� ������ -1�� �����Ѵ�.
	int indexOf(String str, char c){
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c ) {
				return i; // �޼ҵ�� ������ ������ ���� �����
			}
		}
		 return -1;
//		 if(str.== c) {
//			 System.out.println(data.indexOf());
//		 }
	 }
	
	
	
	
	
	
	
	

	
	
// �� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ� -> ���ϰ��� ������ �ϳ�
	// �ּҰ� �ϳ��� �޾ƿ��� -> �迭
	// �и� 0�̸� �ȵ�
//	 int div(int num1, int num2) {
//		int[] d = {num1/num2, num1%num2};
//		 
//		 int result1 =  num1/num2;
//		int result2 = num1%num2;
//		 return result1 result2;
//	 }	
//	
	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
		methodTask.indexOf("abc", 'a');
		//Ŭ������     ������		��ü ����
		
		} 
	}

