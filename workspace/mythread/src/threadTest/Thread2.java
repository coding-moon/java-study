package threadTest;


public class Thread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {Thread.sleep(500);} catch (InterruptedException e){;}
		}
	}
}

// run(): JVM이 모름 운영체제랑 소통을 안하고 바로 실행함
//	-> main()과 같은 역할 
// ＃run만 실행하면 단일 메소드(메소드 위쪽에 스택이 쌓임) 병행처리 못함