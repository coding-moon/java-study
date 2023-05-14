package collectionTask;

import java.util.ArrayList;

import com.sun.tools.javac.code.Attribute.Array;

public class UserField {

// 회원 정보를 담을 DB를 ArrayList로 선언
	

	ArrayList<User> userinfo = DBconnecter.users;
	

	// 회원가입 // User 객체 하나로 받기
	public void join(User user, String id, String password, String name, String phoneNumber) {
		
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		user.setPhoneNumber(phoneNumber);
		userinfo.add(user);
	}
	
	// 아이디 중복검사	
	public boolean checkid(User user, String id) {
		// 내가 입력한 값이랑 유저 디비에 있는 값이랑 비교
		 boolean check = false;
		for (int i = 0; i < userinfo.size(); i++) {
			if(userinfo.get(i).getId().equals(id)) {
				return !check;
			}
				
		}
		return check;
		
	}
	
	//로그인 // 매개변수 필드명 같게 
		public boolean login(User user, String id, String password) {
			//User datas = join(userDB, user, id, password);
		for (int i = 0; i < userinfo.size(); i++) {
			if(userinfo.get(i).getId().equals(id) && userinfo.get(i).getPassword().equals(password)) {
				return true;
			}

		return false;
		}
		//	암호화
		
		public String encryption(String password) {
			String encrypw = "";
			for (int i = 0; i < password.length(); i++) {
			encry = encry + (char)(password.charAt(i) 	
				
				
			}
		}
		
	// 비밀번호 변경 
		public void  changePassword(User user) {
		
		}
			
		//비밀번호 찾기 서비스
			
		
		
	// 	인증번호 생성
	//
		
	
		}
}
