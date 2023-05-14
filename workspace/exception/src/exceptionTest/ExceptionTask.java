package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
   public static void main(String[] args) {
//      5개의 정수만 입력받기
//      - 무한 입력 상태로 구현
//      - q 입력 시 나가기
//      - 각 정수는 배열에 담기
//      - if문은 딱 한 번만 사용하기
      Scanner sc = new Scanner(System.in);
      int[] arData = new int[5];
      String temp = null;
      
      for(int i=0;; i++) { //for문 무한으로 반복됨 
         System.out.print(i + 1 + "번째 정수[q: 나가기]: ");
         temp = sc.next();
         temp = temp.toLowerCase();
         // toLowerCase(): 대상 문자열을 소문자로 바꿔줌 
         if(temp.equals("q")) {
            break;
         }
         // toUpperCase(): 대상 문자열을 모두 대문자로 변환   
         // trim():대상 문자열의 앞/뒤 공백문자를 모두 제거하여 리턴
         try {
            arData[i] = Integer.parseInt(temp);
            
         } catch (NumberFormatException e) {
            System.out.println("정수만 입력해주세요.");
            i--;
            
         } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5개의 정수만 입력이 가능합니다.");
            for (int j = 0; j < arData.length; j++) {
               System.out.print(arData[j] + " ");
            }
            break;
            
         } catch (Exception e) {
            System.out.println("다시 시도해주세요.");
            i--;
         }
      }
   }
}















