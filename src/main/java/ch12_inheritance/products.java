package ch12_inheritance;

public class products {
    public class product extends Item  {
    private int pricel;
    private int stockl;
// 빨간줄 생기길래 생성자 만들래서 만들었더니 부모 속성만 받아옴

    // 부모의 속성과 자식의 속성을 전부 다 입력해야하는 AllargsConstructor를 생성하시오

        // 부모 속성의 setter / getter

        // 자식 속성의 setter / getter를 정의하시오.


        public product() {
            super();
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }}
