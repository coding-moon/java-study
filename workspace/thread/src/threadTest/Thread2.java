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
//Thread2 클래스는 Thread를 상속 받지 않음
//run() : JVM이 모름 운영체제랑 소통을 안함 바로 실행함
// start() : 쓰레드의 start() 메서드를 호출하지 않고 run() 메서드를 직접 호출하면 
//쓰레드는 스케쥴러에 포함되지 않고 일반 메서드를 호출한 것처럼 동작합니다. 
//그렇기 때문에 run() 메서드를 수행하는 쓰레드는 호출한 쓰레드가 됩니다.
//스케쥴러에 포함된 쓰레드는 쓰레드 큐 내에서 
//runnable로 대기하다가 수행 차례가 되면 run() 메서드를 호출하여 동작을 수행합니다.