package threadTask;

public class Animal implements Runnable{
//	private String cry;
//
//	public Animal() {;}
//
//
//	public String getCry() {
//		return cry;
//	}
//
//
//	public void setCry(String cry) {
//		this.cry = cry;
//	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	}
	
	

