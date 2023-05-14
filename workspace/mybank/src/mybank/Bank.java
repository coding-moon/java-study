package mybank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	String name;
	String
	 
	
	
	public Bank() {;}
	
	public Bank(String name, int accountNumber, String phoneNumber, String password, int account, int fees) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.account = account;
		
	}
//	
	//회원가입
		
	
	//로그인
	//비밀번호
	
	
	
	boolean passwordcheck(String password) {
		if(this.password.equals(password)) {
			return true;
		}
		return false;
		
	}
	
	int deposit(int depositCount) {
		return this.depositCount;
		
	}
	
	boolean accountCheck(int accountNumber) {
		 if(this.accountNumber == accountNumber) {
			 return true;
		 }
		return false;	 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Bank bank = new Bank();
		String[] menu = {"★환영합니다★",
				"원하시는 메뉴를 선택하세요",
				"1.계좌개설\n2.입금하기\n3.출금하기\n4.잔액조회\n5.계좌번호 찾기\n6.나가기",
				"1.KaKao\n2.Shinhan\n3.KaKao",
				"로그인 성공","로그인 실패"};
		String[] errorMsg = {"다시 입력해주세요","다시 시도해주세요"};
		
		//int choice = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println(menu[i]);
		}
		
		int choice = sc.nextInt();
//		
//				switch(choice){
//				case 1:
//				System.out.println(menu[3]);
//				choice = sc.nextInt();//은행선택
//				
//				//bank.accountOpen();
//				System.out.println(random.nextInt(30));
				
			
				
				//입금하기
				while(true) {
					if(choice == 2){
						
						System.out.println("계좌번호 입력 : ");
						bank.accountCheck(sc.nextInt());
						System.out.println("입금하실 금액 : ");
					bank.deposit(bank.depositCount = sc.nextInt());
					System.out.println(bank.depositCount++);	
				}else{
					System.out.println(errorMsg[0]);
				}
			
			
			}
				
				
					System.out.println("다시 시도해주세요");
				
		

	}
}

