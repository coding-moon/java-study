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
	//ȸ������
		
	
	//�α���
	//��й�ȣ
	
	
	
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
		String[] menu = {"��ȯ���մϴ١�",
				"���Ͻô� �޴��� �����ϼ���",
				"1.���°���\n2.�Ա��ϱ�\n3.����ϱ�\n4.�ܾ���ȸ\n5.���¹�ȣ ã��\n6.������",
				"1.KaKao\n2.Shinhan\n3.KaKao",
				"�α��� ����","�α��� ����"};
		String[] errorMsg = {"�ٽ� �Է����ּ���","�ٽ� �õ����ּ���"};
		
		//int choice = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println(menu[i]);
		}
		
		int choice = sc.nextInt();
//		
//				switch(choice){
//				case 1:
//				System.out.println(menu[3]);
//				choice = sc.nextInt();//���༱��
//				
//				//bank.accountOpen();
//				System.out.println(random.nextInt(30));
				
			
				
				//�Ա��ϱ�
				while(true) {
					if(choice == 2){
						
						System.out.println("���¹�ȣ �Է� : ");
						bank.accountCheck(sc.nextInt());
						System.out.println("�Ա��Ͻ� �ݾ� : ");
					bank.deposit(bank.depositCount = sc.nextInt());
					System.out.println(bank.depositCount++);	
				}else{
					System.out.println(errorMsg[0]);
				}
			
			
			}
				
				
					System.out.println("�ٽ� �õ����ּ���");
				
		

	}
}

