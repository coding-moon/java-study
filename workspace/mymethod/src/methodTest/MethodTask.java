package methodTest;

public class MethodTask {
	// 1~10까지 println()으로 출력하는 메소드
//	void number(){
//		for (int i = 0; i < 9; i++) {
//			System.out.println(i + 1);
//		}
//		
//	}
	// "홍길동"을 n번 println()으로 출력하는 메소드
	// 이름을 n번 println()으로 출력하는 메소드
	// 세 정수의 뺄셈을 해주는 메소드

//  1~n까지의 합을 구해주는 메소드
	int addFrom1(int end) {
		int sum = 0;
		for (int i = 0; i < end; i++) {
			sum += i + 1;
		} 
		return sum;
	}
	
	
//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	 int change(int count) {
		 return ++count; // 증가 후 연산을 수행
	 }
	 
//	문자열을 입력받고 소문자는 대문자로 대문자는 소문자로 바꿔주는 메소드
	String strUpperorLower(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); // charAt(): String으로 저장된 문자열 중 그 하나의 인덱스방(주소값을) 찾아 그 방의 문자를 출력
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
	
	 
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드 
	int getCount(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
			count++;
			}		
		}
		return count;
	}
	
//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	int getValue(int[] arData, int index){
		return arData[index];
	}
//  한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
	change(String hangle){
		String hangleOrigin = "일이삼사오육칠팔구";
		
		
	}
	
//  5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//  5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)

// indexOf()만들기
// 문자열과 문자를 입력받은 뒤 해당 문자가 몇 번째 인덱스에 있는 지 검사하고
// 만약 해당 문자가 없으면 -1을 리턴한다.
	int indexOf(String str, char c){
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c ) {
				return i; // 메소드는 리턴을 만나는 순간 종료됨
			}
		}
		 return -1;
//		 if(str.== c) {
//			 System.out.println(data.indexOf());
//		 }
	 }
	
	
	
	
	
	
	
	

	
	
// 두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드 -> 리턴값은 무조건 하나
	// 주소값 하나로 받아오기 -> 배열
	// 분모가 0이면 안됨
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
		//클래스명     변수명		객체 생성
		
		} 
	}

