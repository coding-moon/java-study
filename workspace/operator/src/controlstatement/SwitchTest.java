package controlstatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
//      ����ڿ��� �Ʒ��� �޴��� ����ϰ�
//      ��ȣ�� �Է¹޴´�.
      
//      1. ������
//      2. ������
//      3. �����
//      4. ���

//      ����ڰ� �Է��� ��ȣ�� ������ ����� ����Ѵ�.
      
      String title = "������ ����ּ���!";
      String menu = "1.������\n2.������\n3.�����\n4.���";
      String result = null;
      int choice = 0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println(title);
      System.out.println(menu);
      choice = sc.nextInt();
      
     
      
      System.out.println(result);
   }
}
