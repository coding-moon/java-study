package threadTask;

public class ThreadTask {
	//����� 
	//��Ƽ������
	// ����ȭ
	//���� �����
	//DATE
	//
//	[�ǽ�]
//			�����̳� ���������� 3������ ������ �ִ�.
//			�� ������ ���� �Ҹ��� �ٸ��� 2������ ������ ���ÿ� ���.
//			������ 1���� ������ 2���� ������ ��� ��� ���� �������� ���.
//
//	-> join()�̿��Ͽ� ����
//			package���� threadTask���� ����� Ŭ������ 2���� �����Ѵ�.
//			�ϳ��� Ŭ�������� main �����尡 �ִ�.
//			Runnable �������̽��� ��Ƽ �����带 �����ϰ� �ݵ�� join()�� ����Ѵ�.
//			�� �� ������ 10������ ���.
//
//
//			- �ּ��� �ۼ��Ͽ��°�
//			- Thread�� name�ʵ带 ����� �� �ִ°�
//			- �迭�� ����Ͽ��°�????????????
//			- Ŭ������ �� �� �����Ͽ��°�
//			- ������ : ���ٽ��� ����Ͽ��°�, main �����带 ����Ͽ��°�
//	

	public static void main(String[] args) {
	// Animal animal = new Animal();
	 
	// Runnable�� �������̽� �̹Ƿ� run()�޼ҵ带 �ʼ� ������ �ؾ���
	//() �Լ��� �������̽��� �͸� �޼ҵ��� run �޼ҵ��ϳ��̹Ƿ� �̸���� ������  
	// () -> {}: ���ٴ� �͸� �Լ� 
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
	 
	 Thread t1 = new Thread(target, "�۸�"); //��
	 Thread t2 = new Thread(target, "�ܲ�"); // ����
	 Thread t3 = new Thread(target, "�в�"); // ����
	 
	 t1.start();
	 t2.start();
	 
	 try {t2.join();} catch (InterruptedException e) {;}
	
	 t3.start();
	}




}
