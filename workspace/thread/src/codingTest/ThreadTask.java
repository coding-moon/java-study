package codingTest;

import java.util.Scanner;

public class ThreadTask implements Runnable{
	
	public ThreadTask() {;}

	public void printFirst(Runnable first) {
		first.run(); // ���� ����
	}

	public void printSecond(Runnable second) {
		second.run(); // ���� ����
	}

	public void printThird(Runnable third) {
		third.run(); // ���� ����
	}
	
	@Override
	public void run() {
			switch(Thread.currentThread().getName()) {
			case "1" : 
			case "2" :
			case "3" :
				
			}
	}
	public static void main(String[] args) {
			// ���ѽð� : 1�ð�
			// 3���� �����尡 �ִ�.
			// Thread1, Thread2, Thread3
			// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�.
			
			// �Է� ��) 3 1 2
			// ��� ��) third first second
			
			// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.
			
			// Thread1 : third
			// Thread2 : first
			// Thread3 : second
			
			// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		ThreadTask threadTask = new ThreadTask();
		
		int data = sc.nextInt();
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		
		
		
			
		
		
		
	}

	
	
}





