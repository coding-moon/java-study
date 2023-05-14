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
		
		//����̹��� �޸𸮿� �Ҵ�
		// Class -> JVM���� ������ Ŭ�������� ������ �����ϴ� ������ ��Ÿ Ŭ����
		// �ڹ��� Ŭ���� ���ϵ��� ����Ʈ�ڵ�� �����ϵǾ� static�� �Բ� method ������ �����
		// Ŭ���� �̸��� �˸� Ŭ������ ������ ã�� �� �ִ�	
		// -> forName -> Class�� static �޼ҵ�
		// -> Ŭ������ �̸��� �Ű������� �޾Ƽ� Class ��ü�� ������
		// -> JDBC ������ Driver Ŭ������ JVM�� �ε��ϱ� ���ؼ� ����
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//������ �����Ͽ� ���� ��ü ��������
			connection = DriverManager.getConnection(url, userName, password);
			
	}

}
