package Exception;

import java.util.Scanner;

public class ExceptionTask {
	// 5���� ������ �Է¹ޱ�
	// ���� �Է� ���·� ����
	//  q �Է½� ������
	// �� ������ �迭�� ���
	// if���� �� �ѹ��� ����ϱ�
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		
		
//		System.out.println("5�� ���� �Է� : ");
		
		for(int i = 0;;  i++) {	//for�� �������� �ݺ��� 
		System.out.print(i+1+"��° ���� �Է�: ");
		String data2 = sc.next();  
		data2.toLowerCase();
		if(data2.equals("q")) {
			break;
		}
			try {
				data[i] = Integer.parseInt(data2);
				System.exit(0);//
				System.out.println("������");
			
			} catch(NumberFormatException e) {
				System.out.println("������ �ٽ� �Է��ϼ���");
			}			
				i--;
			}
		}
		
	}

