package collectionTask;

import java.util.ArrayList;

import com.sun.tools.javac.code.Attribute.Array;

public class UserField {

// ȸ�� ������ ���� DB�� ArrayList�� ����
	

	ArrayList<User> userinfo = DBconnecter.users;
	

	// ȸ������ // User ��ü �ϳ��� �ޱ�
	public void join(User user, String id, String password, String name, String phoneNumber) {
		
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		user.setPhoneNumber(phoneNumber);
		userinfo.add(user);
	}
	
	// ���̵� �ߺ��˻�	
	public boolean checkid(User user, String id) {
		// ���� �Է��� ���̶� ���� ��� �ִ� ���̶� ��
		 boolean check = false;
		for (int i = 0; i < userinfo.size(); i++) {
			if(userinfo.get(i).getId().equals(id)) {
				return !check;
			}
				
		}
		return check;
		
	}
	
	//�α��� // �Ű����� �ʵ�� ���� 
		public boolean login(User user, String id, String password) {
			//User datas = join(userDB, user, id, password);
		for (int i = 0; i < userinfo.size(); i++) {
			if(userinfo.get(i).getId().equals(id) && userinfo.get(i).getPassword().equals(password)) {
				return true;
			}

		return false;
		}
		//	��ȣȭ
		
		public String encryption(String password) {
			String encrypw = "";
			for (int i = 0; i < password.length(); i++) {
			encry = encry + (char)(password.charAt(i) 	
				
				
			}
		}
		
	// ��й�ȣ ���� 
		public void  changePassword(User user) {
		
		}
			
		//��й�ȣ ã�� ����
			
		
		
	// 	������ȣ ����
	//
		
	
		}
}
