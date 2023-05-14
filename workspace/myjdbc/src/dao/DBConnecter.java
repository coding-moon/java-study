package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnecter {
	public static Connection getConnection() {
		Connection connection = null;
		
		//jdbc 
		String userName = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		//드라이버를 메모리에 할당
		// Class -> JVM에서 동작할 클래스들의 정보를 묘사하는 일종의 메타 클래스
		// 자바의 클래스 파일들은 바이트코드로 컴파일되어 static과 함께 method 영역에 저장됨
		// 클래스 이름만 알면 클래스의 정보를 찾을 수 있다	
		// -> forName -> Class의 static 메소드
		// -> 클래스의 이름을 매개변수로 받아서 Class 객체를 리턴함
		// -> JDBC 에서는 Driver 클래스를 JVM에 로드하기 위해서 사용됨
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//정보를 전달하여 연결 객체 가져오기
			connection = DriverManager.getConnection(url, userName, password);
			
	}

}
