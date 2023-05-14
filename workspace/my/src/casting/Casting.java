package casting;

class Parent{
	
	
	void parent() {
		System.out.println("부모 생성자 호출");
	}

}

class Child extends Parent{
	
	@Override
	void parent() {
		System.out.println("부모 생성자 호출금지");
	}
	
	
	void child(){
		System.out.println("자식 생성자 호출");
	
	
	}
}




public class Casting {
	public static void main(String[] args) {
		
	//Child child = new Child();
//	child.parent();
//	child.child();
	
	// 업캐스팅 - 메모리상에 자식이 부모로 바뀌게 되면 부모필드만 메모리 상에 올라가고 
	//	나머지 자식은 숨겨져 있음 
	// 필드를 다 채워야 업캐스팅이 됨 
	Parent up = new Child();
	up.parent();
	
	Child c = (Child)up;
	
	}
	
}
