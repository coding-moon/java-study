package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		// 필드에는 공통 요소만 묶기
		
		// 자원 : run() 메소드가 재정의된 객체
	//	Thread2 thread = new Thread2(); -> Object ,Runnable, Thread2 
	//	Runnable thread = new Thread2(); 업캐스팅됨 
		
		// 모든 자식은 업
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(50);} catch (InterruptedException e) {;}
			}
		};
		
		Thread t1 = new Thread(target, "?");
		Thread t2 = new Thread(target, "!");
		
		t2.start(); // 스케줄링 멀티 쓰레드로 스케줄링해줌 -> 처리경로 나눠주는 것
		// join() : 먼저 진행하는 프로세스가 끝나야 기다리는 다음 프로세스를 진행해줌
		try {t2.join();} catch (InterruptedException e) {;}
		
		t1.start();
		
		System.out.println("안녕");
		
//		Thread1 t1 = new Thread1("♥");
//		Thread1 t2 = new Thread1("★");
//		
//		t1.start();
//		t2.start();
		
//		t1.run();
//		t2.run();
	
	}
}














