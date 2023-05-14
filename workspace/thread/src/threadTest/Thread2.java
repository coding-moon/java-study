package threadTest;

public class Thread2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
}
//Thread2 Ŭ������ Thread�� ��� ���� ����
//run() : JVM�� �� �ü���� ������ ���� �ٷ� ������
// start() : �������� start() �޼��带 ȣ������ �ʰ� run() �޼��带 ���� ȣ���ϸ� 
//������� �����췯�� ���Ե��� �ʰ� �Ϲ� �޼��带 ȣ���� ��ó�� �����մϴ�. 
//�׷��� ������ run() �޼��带 �����ϴ� ������� ȣ���� �����尡 �˴ϴ�.
//�����췯�� ���Ե� ������� ������ ť ������ 
//runnable�� ����ϴٰ� ���� ���ʰ� �Ǹ� run() �޼��带 ȣ���Ͽ� ������ �����մϴ�.