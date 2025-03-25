package ch12_arrays;


import java.lang.reflect.Array;

/*


         배열의 출력

         이전 수업에서 sout(arr)형태로 배열을 출력하게 되면 배열은 참조 변수이기 때문에
         주소값만 출력된다는 점을 확인했습니다. 그리고 반복문을 통해 element들을
         불러올 수는
 */
public class Array10 {
    public static void main(String[] args) {
        String[] persons = {"강수림", "기준성", "김미진", "김준식",
                "문성진", "심민호", "양지은", "유지현", "윤현지", "이동규",
                "이예성", "이정화", "전용남", "채수원", "한영진"};



    /*
     1번 : 강수림 님
     2번 : 기준성 님
     ...
     15번 : 한영진 님

     */


        for(int i = 0 ; i < persons.length ; i++) {

        System.out.println((i + 1) + "번 : " + persons[i] + " 님");

         // 10칸짜리 빈 배열 nums를 선언하시고 1~10까지 집어넣어주세요.
            // 그리고 1 2 3 4 ... 10 으로 출력할 수 있게끔
            // 일반 for문 / 향상된 for문으로 작성하세요.
        }

    }
}


Array.sort(numbers); // 대부분의 경우에는 메서드를 사용하고 나면
// 그 결과값을 변수에 대입해왔지만 . sor
//
//

        public static void main(String[] args) {
            System.out.println();
            System.out.println("정렬 후 배열 : " +Array. toString(numbers));


        }