package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("메시지 : ");
		message = sc.nextLine();
		
		//contains: 문자열 포함
		if(message.contains("바보")) {
			try {
				throw new BadWordException("욕설은 안돼여!");
			} catch (BadWordException e) {
				System.out.println(e.getMessage());
			}
		// throw : 예외를 발생시키는 명령어	
		}
	
		
	
	
	
	
	
	
	
	}
}
