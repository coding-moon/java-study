package bank;

import java.util.Iterator;

public class Bank {
//	은행
//	예금주
//	계좌번호(중복 없음)
//	핸드폰번호(중복 없음)
//	비밀번호
//	통장잔고	
	
	
	private String name;
	private String phoneNumber;
	private String password;
	private String account;
	private int money;
	
	public Bank() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}	
	
	
//	은행은 3개를 선언한다
//	모든 은행 고객를 관리하는 DB를 2차원 배열로 선언한다
//	모든 은행은 출금, 입금, 잔액조회, 계좌개설, 계좌번호
//	중복검사, 로그인, 핸드폰 번호 중복검사 서비스가 있다
//	화면쪽 메뉴는 "계좌개설, 입금하기, 출금하기, 잔액조회, 
//	계좌번호 찾기(새로운 계좌발급, 핸드폰 번호로 서비스 이용가능), 나가기"로 구성되어 있다
//	계좌번호는 Random클래스를 사용하여 6자리로 설정한다.

	
// 입금
	public void deposite(int money) {
		this.money += money;
	}

	// 출금
	public void withdraw(int money) {
		this.money -= money;
	}
	
// 잔액조회
	public int amount() {
		return money;
	}
	
	
// 계좌번호 중복검사
	public Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		Bank bank = null;
		for(int i = 0; i < arrBank.length; i++) {	
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getAccount().equals(account)) {
					bank = arrBank[i][j]; 
					break;
					}
				}
				if(j != arCount[i]) {break;}	
			}
		return bank;
	}
		
		
		
	// 핸드폰 번호 중복검사
	public static Bank checkphoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getPhoneNumber() == phoneNumber) {
					bank = arrBank[i][j]; 
					break;
				}
			}
			if(j != arCount[i]) {break;}
		}
		return bank;
	}
	
// 로그인
	public static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
		if(user != null) {
			if(user.getPassword().equals(password)) {
				
			}
		}
	
	}
	
	
	
	
	
}

