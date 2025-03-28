package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
//        int[] arr1 = { 1, 2, 3, 4, 5 };
//        int i = 1;
//        System.out.println(i);
//        System.out.println(arr1);

//        String strExample1 = "안녕하세요";
//        System.out.println(strExample1);
//
//        String strExample2 = new String("안녕하세요");
//        System.out.println(strExample2);
//
//        if(strExample1 == strExample2) {
//            System.out.println("같다");
//        }
        // 배열의 element 출력 방법
//        int[] arr2 = {9,8,7,6,5};
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//        System.out.println(arr2[3]);
//        System.out.println(arr2[4]);

        // 어 근데 위에 있는거 보니까 반복되네? 반복문 쓸 수 있겠네
//        for (int i = 0 ; i < 5 ; i++) {
//            System.out.println(arr2[i]);
//        }

        // 9 8 7 6 5
//        for (int i = 0 ; i < 5 ; i++) {
//            System.out.print(arr2[i]+ 1 + " ");
//        }
//        System.out.println();
        // 예를 들어 ages 라는 배열을 선언했다고 가정했을 때, 다음 해가 되면
        // +1씩 시켜줘야되는데, 원래는 하나하나 재대입해가지고 집어넣어야되겠지만
        // 배열에 저장해뒀다면 element들만 반복문으로 뽑아낸 뒤에 더해줄 수 있습니다.

//        for (int i = 0 ; i < 5 ; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
        // arr2 = {9,8,7,6,5}가 있는데
        // arr2 = {18, 16, 14, 12, 10}로 바꿔서(*2하셔야합니다 재대입하지마시고)
        // 반복문을 통해 각 element를 출력하시오.
//        for (int i = 0 ; i < 5 ; i++) {
////            arr2[i] = arr2[i] * 2;
//            arr2[i] *= 2;
//            System.out.print(arr2[i] + " ");
//        }

        // 배열의 방의 개수를 정확하게 모를 때 쓸 수 있는 방법
//        for (int i = 0 ; i < arr2.length ; i++) {
//            arr2[i] *= 2;
//            System.out.print(arr2[i] + " ");
//        }

        // String 배열 선언 및 초기화
        String[] strArr1 = {"안", "녕", "하", "세", "요"};

        // element들 하나하나 출력하는데 실행결과 안녕하세요 로 콘솔에 출력
        for(int i = 0 ; i < strArr1.length ; i++) {
            System.out.print(strArr1[i]);
        }
        System.out.println();
        // 출력결과 안/녕/하/세/요/ 로 출력되게 할 것
        for(int i = 0 ; i < strArr1.length ; i++) {
            System.out.print(strArr1[i] + "/");
        }

/*
1.배열의 필요성
2. 각 element 출력 방법
3. 2에 더해서 향상된 for문 구조
4. 배열을 응용한 methods
5. 4에 더해서 접근 지정자 개념 도입 ->method 내에서 medthod를 호출
6. 배열 전체의 출력
7. 오름 차순 정렬
8. 내림 차순 정렬
9. 7, 8의 경우와 각 element 별 추출 방식의 차이
 */

    }
}