package ch_09_classes;

import java.util.Scanner;

public class ClassAMain {

    public static void main(String[] args) {
        // ClassA ClassA = new ClassA();
        // 클래스명 객체명 = new 클래스명();

        // Scanner imporet -> 알고보니 Scanner도 Class였다
        // 그리고 이전까지는 Scanner가 변수라고 했지만 사실은 객체였다.
        // 정확하게는 Scanner 클래스의 인스턴스였다.

        Scanner scanner = new Scanner(System.in);

        //객체의 속성을 참조하는 법 : 객체명, 속성명
//        ClassA classA1 = new ClassA();
//        System.out.println("이름을 입력하세요 >>>");
//        classA1.name = scanner.nextLine(); // name은 String이니까
//        System.out.println("점수를 입력하세요>>>");
//        classA1.score = scanner.nextDouble(); //score는
//        System.out.println("번호를 입력하세요 >>>");
//        classA1.num = scanner.nextInt();
//
//        System.out.println(classA1.num + classA1.name + classA1.score + "점입니다.");
//
//        // 이상까지의 코드는 객체의 속성에 값을 대입하고, 이를 출력하는 방법

        // method를 호출
        ClassA classA2 = new ClassA();
        classA2.name = "김이";
        classA2.callName();
        ClassA classA3 = new ClassA();
        classA3.name = "이삼";
        classA3.callName();

        // void callNamd() { //
     Korit_3_java
