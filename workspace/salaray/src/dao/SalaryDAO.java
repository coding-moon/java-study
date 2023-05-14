package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import domain.SalaryVO;

public class SalaryDAO {
//   추가
//   public void insert(SalaryVO salaryVO) throws IOException{
//      BufferedWriter bufferedWriter = DBConnector.getAppend();
//      String content = new String(Files.readAllBytes(Paths.get(DBConnector.PATH)));
//      String temp = null;
//      temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
//      temp += salaryVO.toString();
//      bufferedWriter.write(temp);
//      bufferedWriter.close();
//   }
   
//   수정(소득세)
 //  public void update(SalaryVO salaryVO) throws IOException {
      // 파일 읽어오기
//	  BufferedReader bufferedReader = DBConnector.getReader();
//      String line = null, temp = "";
//      
//      while((line = bufferedReader.readLine()) != null) {
//         if(line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "만원")) {
//            String data = line.substring(0, line.lastIndexOf("   "));
//            
//            temp += data.substring(0, data.lastIndexOf("   ")) + "   " 
//                  + insertComma(salaryVO.getIncomeTax()) + "   "
//                  + insertComma(salaryVO.getLocalTax()) + "\n";
//            continue;
//         }
//         temp += line + "\n";
//      }
//      BufferedWriter bufferedWriter = DBConnector.getWriter();
//      bufferedWriter.write(temp);
//      
//      bufferedWriter.close();
//      bufferedReader.close();
//   }
//   삭제
//   public void remove(SalaryVO salaryVO) throws IOException {
//	      BufferedReader bufferedReader = DBConnector.getReader();
//	      String line = null, temp = "";
//	      
//	      while((line = bufferedReader.readLine()) != null) {
//	         if(line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "만원")) {
//	            //String data = line.substring(0, line.lastIndexOf("   "));
//	            
//	            //temp += data.substring(0, data.lastIndexOf("   ")) + "   " 
//	             //     + insertComma(salaryVO.getIncomeTax()) + "   "
//	              //    + insertComma(salaryVO.getLocalTax()) + "\n";
//	            continue;
//	         }
//	         temp += line + "\n";
//	      }
//	      BufferedWriter bufferedWriter = DBConnector.getWriter();
//	      bufferedWriter.write(temp);
//	      
//	      bufferedWriter.close();
//	      bufferedReader.close();
//   }
// File writer 열면서 내용 날라가버림
	public void delete (int salary) { 
		
	}
   
//   조회 // 한줄 
   public SalaryVO salary(SalaryVO salaryVO) throws IOException {
	  BufferedReader bufferedReader = DBConnector.getReader(); 
	  
//	  
//	   
//	  return salaryVO;
//   }
   
   
   
//   목록
   public void list() throws IOException {
	   String set = new String(Files.readAllBytes(Paths.get(DBConnector.PATH))); //문자열로 만듦
       System.out.println(set);

  }   
   
//   public static String insertComma(int number) {
//      String temp = String.valueOf(number);
//      String result = "";
//      
//      for (int i = 0; i < temp.length(); i++) {
//         if(i != 0 && i % 3 == 0) {
//            result = "," + result;
//         }
//         result = temp.charAt(temp.length() - 1 - i) + result;
//      }
//      return result;
//   }
   
}





























