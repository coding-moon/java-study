package inheritanceTest;

class A {
	String name = "A";
	int data = 10;

	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	void printData() {
		System.out.println(data);
	}
	
}



public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		b.printName();
	}


}
