package casting;

class Parent{
	
	
	void parent() {
		System.out.println("�θ� ������ ȣ��");
	}

}

class Child extends Parent{
	
	@Override
	void parent() {
		System.out.println("�θ� ������ ȣ�����");
	}
	
	
	void child(){
		System.out.println("�ڽ� ������ ȣ��");
	
	
	}
}




public class Casting {
	public static void main(String[] args) {
		
	//Child child = new Child();
//	child.parent();
//	child.child();
	
	// ��ĳ���� - �޸𸮻� �ڽ��� �θ�� �ٲ�� �Ǹ� �θ��ʵ常 �޸� �� �ö󰡰� 
	//	������ �ڽ��� ������ ���� 
	// �ʵ带 �� ä���� ��ĳ������ �� 
	Parent up = new Child();
	up.parent();
	
	Child c = (Child)up;
	
	}
	
}
