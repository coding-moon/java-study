package job;

import java.util.Random;
import java.util.Scanner;
// �ּ� �� �ޱ� 

class Lotte{
	String name;// �̸�
	String password;
	int getmoney; // ����
	int lostmoney;
	boolean check; // �α��� ���� ���� ���� Ȯ��
	
	{
		password = "0000"; // ��й�ȣ �ʱ�ȭ
		getmoney = 0;
	}
	
	 public Lotte() {}

	public Lotte(String name, int getmoney, String password) {
		this.name = name;
		this.getmoney = getmoney;
		this.password = password;
	}
	
	void loginSuccess() {
		check = true;
	}
	
		
//		check = false;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�α��� ���� ��й�ȣ�� �ٽ� �Է��ϼ���");
//		System.out.print("��й�ȣ �Է� : ");
//		this.password = sc.next();	
		

	
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	
	//�źл���� ��÷�Ǹ� ���
	//�� ������ stay
	//�����ϸ� �ذ� �Ǵ� �϶�

	
}

public class ProjectPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Lotte lotte = new Lotte();
		
		String welcome = "LotteGame�� ���� ������ ȯ���մϴ�",
				upgrade = "�����Ӵ� 400���� ä��",
			menu = "1.�˹�\n2.����\n3.����",
			select = "����� �����Ͻÿ�",
			pw = "��й�ȣ �Է� : ";
			
		int[] rating = new int[20];
		int data = 20; 
		int choice = 0;
		String password = ""; 
		boolean flag = false;
		
		while(true) {
			System.out.println(welcome);
			
			System.out.print(pw);
			password = sc.next();
			
			if(lotte.password.equals(password)) {
				lotte.loginSuccess();
				System.out.println("�α��� ����");
				
				while(true) {
					System.out.println(select);
					System.out.println(menu);
					choice = sc.nextInt();
					
					switch(choice) { 
					case 1:
						System.out.println("�� ���� �̱⸦ ��������");
						for (int i = 0; i < data; i++) {
							data = rating[i];
						}
						if(rating[random.nextInt(20)] < 10) {
							++lotte.getmoney;
						}else{	
							System.out.println(lotte.getmoney);
							//flag = true;
						}
						break;
					case 2:
						System.out.println(upgrade);
						
						break;
					case 3:
						System.out.println("��� �˹ٰ� ���� ���� �ڸ���...���ư�");
						break;
					default:
						break;
				}
			}//else{
//				System.out.println("�α��� ����");
//				}
					
			}
			
		}
	}	
}