package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        // 정적 메서드의 호출
        System.out.println(Product.getCount());

        // 객체 생성
        Product product1 = new Product();

        // count / instanceCount 값 확인
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product1.getInstanceCount());    // 일반 메서드 호출

        // 객체 생성
        Product product2 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product2.getInstanceCount());    // 일반 메서드 호출

        System.out.println("product1 : " + product1.getInstanceCount());

        Product product3 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product3.getInstanceCount());    // 일반 메서드 호출
        Product product4 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product4.getInstanceCount());    // 일반 메서드 호출
        Product product5 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product5.getInstanceCount());    // 일반 메서드 호출
        Product product6 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product6.getInstanceCount());    // 일반 메서드 호출
        Product product7 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product7.getInstanceCount());    // 일반 메서드 호출
        Product product8 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product8.getInstanceCount());    // 일반 메서드 호출

        public class ProductViewMain {
            public static void main(String[] args) {
                // 객체 생성
                // ProductView ProductView1 = new ProductView():

                ProductView ProductView1 = new ProductView.getInstance();
                ProductView ProductView2 = new ProductView.getInstance();
                ProductView ProductView3 = new ProductView.getInstance();
                ProductView ProductView4 = new ProductView.getInstance();

                // private으로 생성자를 선언
                private ProductVeiw {
                    int counter = 1;
                    System.out.println(counter + "번 쨰 객체가 생성되었습니다.");
counter++;


                }



            }
        }


    }
}

