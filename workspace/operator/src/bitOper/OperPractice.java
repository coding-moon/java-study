package bitOper;

import java.util.Scanner;

public class OperPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		count = sc.nextInt();
		
		
		//���������� i++: ���� ������ ������ �� ����
		//		++i : ���� �� ������ ����
		System.out.println(count++);// 10 -> 11
		System.out.println(++count);// 11-> 12
	}

}
