package interfaceTest;

public interface Pet {
	final static// 생략 가능
	// static : 모든 객체가 공유하기 위해 사용 , 컴파일러가 직접 읽음
	int EYES = 2;
	public int NOSE = 1;
	
	// abstract : 생략 가능
	public void giveYourHand();
	public void bang();
	public void sitDown();
	public void waitNow();
	public void getNose();
}
