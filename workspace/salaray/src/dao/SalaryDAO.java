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
//   �߰�
//   public void insert(SalaryVO salaryVO) throws IOException{
//      BufferedWriter bufferedWriter = DBConnector.getAppend();
//      String content = new String(Files.readAllBytes(Paths.get(DBConnector.PATH)));
//      String temp = null;
//      temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
//      temp += salaryVO.toString();
//      bufferedWriter.write(temp);
//      bufferedWriter.close();
//   }
   
//   ����(�ҵ漼)
 //  public void update(SalaryVO salaryVO) throws IOException {
      // ���� �о����
//	  BufferedReader bufferedReader = DBConnector.getReader();
//      String line = null, temp = "";
//      
//      while((line = bufferedReader.readLine()) != null) {
//         if(line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "����")) {
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
//   ����
//   public void remove(SalaryVO salaryVO) throws IOException {
//	      BufferedReader bufferedReader = DBConnector.getReader();
//	      String line = null, temp = "";
//	      
//	      while((line = bufferedReader.readLine()) != null) {
//	         if(line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "����")) {
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
// File writer ���鼭 ���� ���󰡹���
	public void delete (int salary) { 
		
	}
   
//   ��ȸ // ���� 
   public SalaryVO salary(SalaryVO salaryVO) throws IOException {
	  BufferedReader bufferedReader = DBConnector.getReader(); 
	  
//	  
//	   
//	  return salaryVO;
//   }
   
   
   
//   ���
   public void list() throws IOException {
	   String set = new String(Files.readAllBytes(Paths.get(DBConnector.PATH))); //���ڿ��� ����
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





























