package interfaceTest;

public interface Pet {
	final static// ���� ����
	// static : ��� ��ü�� �����ϱ� ���� ��� , �����Ϸ��� ���� ����
	int EYES = 2;
	public int NOSE = 1;
	
	// abstract : ���� ����
	public void giveYourHand();
	public void bang();
	public void sitDown();
	public void waitNow();
	public void getNose();
}
