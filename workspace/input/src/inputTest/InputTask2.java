package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		// 3개의 정수를 한 번에 입력 받은 후
		// 세 정수의 곱셈 출력
		// next() 만 사용
		
		// 3개정수 선언하기
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		Scanner sc = new Scanner(System.in);
		
		// 정수 출력하기
		System.out.print("3개의 정수 입력 : ");
		// 3개의 정수 입력
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		num3 = Integer.parseInt(sc.next());
		
		// 최종 결과 출력
		result = num1 * num2 * num3;
		System.out.printf("%d * %d * %d = %d", num1, num2, num3, result);
		
		
		
		
		
		
	}

}
