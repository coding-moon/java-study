package ambiguity;

public interface InterA {
	// 항상 abstract는 생략 되어 있다.
	// default는 일반 메소드를 선언할 시 사용 
	public default void printData() {
		System.out.println("InterA");
	}
}
