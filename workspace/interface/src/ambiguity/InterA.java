package ambiguity;

public interface InterA {
	// �׻� abstract�� ���� �Ǿ� �ִ�.
	// default�� �Ϲ� �޼ҵ带 ������ �� ��� 
	public default void printData() {
		System.out.println("InterA");
	}
}
