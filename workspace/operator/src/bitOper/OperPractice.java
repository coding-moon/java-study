package bitOper;

import java.util.Scanner;

public class OperPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		count = sc.nextInt();
		
		
		//증감연산자 i++: 먼저 연산을 수행한 후 증가
		//		++i : 증가 후 연산을 수행
		System.out.println(count++);// 10 -> 11
		System.out.println(++count);// 11-> 12
	}

}
