package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		// �ʵ忡�� ���� ��Ҹ� ����
		
		// �ڿ� : run() �޼ҵ尡 �����ǵ� ��ü
	//	Thread2 thread = new Thread2(); -> Object ,Runnable, Thread2 
	//	Runnable thread = new Thread2(); ��ĳ���õ� 
		
		// ��� �ڽ��� ��
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(50);} catch (InterruptedException e) {;}
			}
		};
		
		Thread t1 = new Thread(target, "?");
		Thread t2 = new Thread(target, "!");
		
		t2.start(); // �����ٸ� ��Ƽ ������� �����ٸ����� -> ó����� �����ִ� ��
		// join() : ���� �����ϴ� ���μ����� ������ ��ٸ��� ���� ���μ����� ��������
		try {t2.join();} catch (InterruptedException e) {;}
		
		t1.start();
		
		System.out.println("�ȳ�");
		
//		Thread1 t1 = new Thread1("��");
//		Thread1 t2 = new Thread1("��");
//		
//		t1.start();
//		t2.start();
		
//		t1.run();
//		t2.run();
	
	}
}














