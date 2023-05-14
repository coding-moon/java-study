package job;

import java.util.Random;
import java.util.Scanner;
// 주석 꼭 달기 

class Lotte{
	String name;// 이름
	String password;
	int getmoney; // 수익
	int lostmoney;
	boolean check; // 로그인 성공 실패 상태 확인
	
	{
		password = "0000"; // 비밀번호 초기화
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
//		System.out.println("로그인 실패 비밀번호를 다시 입력하세요");
//		System.out.print("비밀번호 입력 : ");
//		this.password = sc.next();	
		

	
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	
	//신분상승은 당첨되면 상승
	//꽝 나오면 stay
	//실패하면 해고 또는 하락

	
}

public class ProjectPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Lotte lotte = new Lotte();
		
		String welcome = "LotteGame에 오신 여러분 환영합니다",
				upgrade = "보유머니 400부터 채워",
			menu = "1.알바\n2.점장\n3.사장",
			select = "등급을 선택하시오",
			pw = "비밀번호 입력 : ";
			
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
				System.out.println("로그인 성공");
				
				while(true) {
					System.out.println(select);
					System.out.println(menu);
					choice = sc.nextInt();
					
					switch(choice) { 
					case 1:
						System.out.println("자 이제 뽑기를 시작하지");
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
						System.out.println("어딜 알바가 감히 사장 자리를...돌아가");
						break;
					default:
						break;
				}
			}//else{
//				System.out.println("로그인 실패");
//				}
					
			}
			
		}
	}	
}