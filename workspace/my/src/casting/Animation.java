package casting;

public class Animation extends Film{

	@Override
	void language() {
		super.language();
		System.out.println("자막없음");
	}
}
