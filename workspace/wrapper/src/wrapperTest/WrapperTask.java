package wrapperTest;

import java.util.Random;

public class WrapperTask {
	public static void main(String[] args) {
		//1, 12.5, 86.6F, 'Z', "Hi", false
		// 위 6개의 값을 6칸 배열에 담기
		//Object 최상위 클래스 -> 일반 자료형은 자동 상속을 받게됨
		
		Object[] o = {1, 12.5, 86.6F, 'Z', "Hi", false};
		Random r = new Random();
		int a = 0;
		
		
		for (int i = 0; i < o.length; i++) {
			a = r.nextInt(o.length);
			System.out.println(a);
		}
		System.out.println(o[a]);
	}

}
