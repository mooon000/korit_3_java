package ch_09_classes;

import java.util.Scanner;

public static double addSubject(double totalScore, double addedScore) {
    return totalScore + addedScore;
}

// 2. 평균을 내는 메서드
public static double calculateAvg(double totalScore, int numberOfSubjects) {
    return totalScore / numberOfSubjects;
}

public class ScoreCalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreCalc scoreCalc = new ScoreCalc();
    }
}
boolean endOfCalc = false;
double score1 = 0;
double totalScore = 0;
int totalSubjects = 1;
double avgScore = 0;

// 점수 입력을 횟수와 상관없이 받기 위한 반복문 작성
        while(!endOfCalc) {
        System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
score1 = scanner.nextDouble();
// score1 = -1이 대입되었다면 반복문이 종료될 수 있도록 하는 조건문 작성
            if(score1 == -1) {  //
        break;
//                 endOfCalc = true;
        }

totalScore = addSubject(totalScore, score1); //
 totalScore = scoreCalc. addScores (totalScore, score1);


// 평균을 계산하는 코드
avgScore = calculateAvg(totalScore, totalSubjects);
avgScore = scoreCalc. addScores(totalScore, score1);
            System.out.println("------ 점수 입력시마다 나오는 합계와 평균입니다. ------");
            System.out.println("입력한 점수의 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);

totalSubjects++;    //
        }

        System.out.println("====== 점수 입력 종료 후 나오는 합계와 평균입니다. ======");
        System.out.println("입력한 점수의 합계 : " + totalScore);
        System.out.println("입력한 점수의 평균 : " + avgScore);


