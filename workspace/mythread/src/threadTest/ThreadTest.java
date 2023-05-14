package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
	
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(500);
				} catch (InterruptedException e) {;}
				
			}
		};
		
		Thread1 t1 = new Thread1(target,"¢¾");
		Thread1 t2 = new Thread1(target,"¡Ú");
		
		t1.run();
		t2.run();
		
	}
}
