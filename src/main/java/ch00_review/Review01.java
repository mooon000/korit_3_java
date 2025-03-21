package ch00_review;

import java.util.Scanner;

public class Review01 {

    //변수 : 데이터를 담는 바구니인데, 이름표를 붙여줘요.
  // 변수의 선언 방식
  // 자료형 변수명 = 데이터;
  // 자료형 : int, double, String boolean
  // 변수명 짓는 규칙 : 카멜케이스
  // ex) 카멜케이스 예시 myExample과 같은 방식으로 작성



  // 이름, 나이, 생년월일을 적절한 자료형과 변수명으로
  //선언 및 초기화 한 다음
  // sout을 통해 다음과 같이 출력하시오/

  /*


  실행 예
          제 이름은 어쩌고저쩌고, 나이는__살입니다
          생일은 20250320입니다
         10년 후에 저는 (__+10)살이 됩니다. 정말 싫네요


 }
   */


 public static void main(String[] args) {




   String name = "문성진";
   int age = 26;
   int birthday = 20000728;
   System.out.println("제 이름은" + name + "이고 나이는" + age + "살입니다");
   System.out.println("생일은" + birthday + "입니다");
   System.out.println("내년에는 " + (age + 10) + "살이 됩니다. 정말 싫네요.");


  Scanner scanner = new Scanner(System.in);

  String name1 = "";
  int age1 = 0;
  int birthday1 = 0;

  System.out.print("이름을 입력하세요>>>");
  name1 = scanner.nextLine();
  System.out.print("나이를 입력하세요>>>");
  age1 = scanner.nextInt();
  System.out.print("생년월일을 입력하세요 (예시 :20250320)>>>");
  birthday1 = scanner.nextInt();

  System.out.println("제 이름은" + name1 + "이고 나이는" + age1 + "살입니다");
  System.out.println("생일은" + birthday1 + "입니다");
  System.out.println("10년후에는 " + (age1 + 10) + "살이 됩니다. 정말 싫네요.");;



 }
}
