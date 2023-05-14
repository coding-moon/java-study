package interfaceTest;

public class Puppy implements Pet {

	@Override
	public void giveYourHand() {
		System.out.println("¿©±â¿ä!");

	}

	@Override
	public void bang() {
		System.out.println("´¯´Â´Ù");
		
	}

	@Override
	public void sitDown() {
		System.out.println("¾É´Â´Ù");
	}

	@Override
	public void waitNow() {
		System.out.println("");
	}

	@Override
	public void getNose() {
		// TODO Auto-generated method stub

	}

}
