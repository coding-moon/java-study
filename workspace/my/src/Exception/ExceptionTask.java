package Exception;

import java.util.Scanner;

public class ExceptionTask {
	// 5개의 정수만 입력받기
	// 무한 입력 상태로 구현
	//  q 입력시 나가기
	// 각 정수는 배열에 담기
	// if문은 딱 한번만 사용하기
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		
		
//		System.out.println("5개 정수 입력 : ");
		
		for(int i = 0;;  i++) {	//for문 무한으로 반복됨 
		System.out.print(i+1+"번째 정수 입력: ");
		String data2 = sc.next();  
		data2.toLowerCase();
		if(data2.equals("q")) {
			break;
		}
			try {
				data[i] = Integer.parseInt(data2);
				System.exit(0);//
				System.out.println("나가기");
			
			} catch(NumberFormatException e) {
				System.out.println("정수를 다시 입력하세요");
			}			
				i--;
			}
		}
		
	}

