package wrapperTest;

import java.util.Random;

public class WrapperTask {
	public static void main(String[] args) {
		//1, 12.5, 86.6F, 'Z', "Hi", false
		// �� 6���� ���� 6ĭ �迭�� ���
		//Object �ֻ��� Ŭ���� -> �Ϲ� �ڷ����� �ڵ� ����� �ްԵ�
		
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
