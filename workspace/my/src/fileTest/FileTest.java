package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException{
//	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/lang.txt"));
	
	
	File file = new File("src/lang.txt");
	if(file.exists()) {
		file.delete();
	}
		
	
	
	//readline() : ���� ���� �� �б�  ���� ���� ������ ������ null�� ����
	//BufferedReader : ���۸� �̿��ؼ� ���� �б�
	// stream : java�� txt������ �̾��ִ¿������
	//	byte�迭�� ���� �Ǿ� ������ ���� �Ǵ� �����͵�
	// �ϰ�ó���� ���� buffer��� �� ����
		//buffer �ӽ� �������  > ���۰� ������ ����ó�� �ؾ��� 
		//utf -8�� ������ �ȿ��� �����͸�ŭ ��Ұ� ������
		
	}
}
