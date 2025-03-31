package ch17_static;

public class Singleton {


 public class Samsung {
//정적 변수
     private static Samsung instance;
     // 멤버 변수

     private String company
     private
     private  Samsung () {}
     company = getClass(). getSimpleName();
     public static Samsung getInstance() {
         if (instance == null)
             instance = new Samsung();
     }
         return instance;
 }
    public static void main(String[] args) {

     public String createSeiralNumber(String model)
 return model + "_"
0    }
}
