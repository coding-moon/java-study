package bank;

import java.util.Iterator;

public class Bank {
//	����
//	������
//	���¹�ȣ(�ߺ� ����)
//	�ڵ�����ȣ(�ߺ� ����)
//	��й�ȣ
//	�����ܰ�	
	
	
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
	
	
//	������ 3���� �����Ѵ�
//	��� ���� ���� �����ϴ� DB�� 2���� �迭�� �����Ѵ�
//	��� ������ ���, �Ա�, �ܾ���ȸ, ���°���, ���¹�ȣ
//	�ߺ��˻�, �α���, �ڵ��� ��ȣ �ߺ��˻� ���񽺰� �ִ�
//	ȭ���� �޴��� "���°���, �Ա��ϱ�, ����ϱ�, �ܾ���ȸ, 
//	���¹�ȣ ã��(���ο� ���¹߱�, �ڵ��� ��ȣ�� ���� �̿밡��), ������"�� �����Ǿ� �ִ�
//	���¹�ȣ�� RandomŬ������ ����Ͽ� 6�ڸ��� �����Ѵ�.

	
// �Ա�
	public void deposite(int money) {
		this.money += money;
	}

	// ���
	public void withdraw(int money) {
		this.money -= money;
	}
	
// �ܾ���ȸ
	public int amount() {
		return money;
	}
	
	
// ���¹�ȣ �ߺ��˻�
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
		
		
		
	// �ڵ��� ��ȣ �ߺ��˻�
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
	
// �α���
	public static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
		if(user != null) {
			if(user.getPassword().equals(password)) {
				
			}
		}
	
	}
	
	
	
	
	
}

