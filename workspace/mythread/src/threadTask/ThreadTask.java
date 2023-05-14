package threadTask;

public class ThreadTask {
	//깃허브 
	//멀티쓰레드
	// 동기화
	//파일 입출력
	//DATE
	//
//	[실습]
//			동석이네 동물원에는 3마리의 동물이 있다.
//			각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//			나머지 1마리 동물은 2마리 동물이 모두 울고 나서 마지막에 운다.
//
//	-> join()이용하여 구성
//			package명은 threadTask으로 만들고 클래스는 2개만 선언한다.
//			하나의 클래스에는 main 쓰레드가 있다.
//			Runnable 인터페이스로 멀티 쓰레드를 구현하고 반드시 join()을 사용한다.
//			※ 각 동물은 10번씩만 운다.
//
//
//			- 주석을 작성하였는가
//			- Thread의 name필드를 사용할 수 있는가
//			- 배열을 사용하였는가????????????
//			- 클래스를 두 개 선언하였는가
//			- 가산점 : 람다식을 사용하였는가, main 쓰레드를 사용하였는가
//	

	public static void main(String[] args) {
	// Animal animal = new Animal();
	 
	// Runnable은 인터페이스 이므로 run()메소드를 필수 재정의 해야함
	//() 함수형 인터페이스로 익명 메소드임 run 메소드하나이므로 이름없어도 가능함  
	// () -> {}: 람다는 익명 함수 
	Runnable target = () -> {
		 for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	 };
	 
	 Thread t1 = new Thread(target, "멍멍"); //개
	 Thread t2 = new Thread(target, "꿀꿀"); // 돼지
	 Thread t3 = new Thread(target, "꽥꽥"); // 오리
	 
	 t1.start();
	 t2.start();
	 
	 try {t2.join();} catch (InterruptedException e) {;}
	
	 t3.start();
	}




}
