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
		
	
	
	//readline() : 파일 한줄 씩 읽기  파일 끝에 파일이 없으면 null로 나옴
	//BufferedReader : 버퍼를 이용해서 파일 읽기
	// stream : java와 txt파일을 이어주는연결통로
	//	byte배열로 구성 되어 단위로 전송 되는 데이터들
	// 일괄처리를 위해 buffer라는 걸 쓴다
		//buffer 임시 저장공간  > 버퍼가 없으면 개별처리 해야함 
		//utf -8은 가변형 안에서 데이터만큼 축소가 가능함
		
	}
}
