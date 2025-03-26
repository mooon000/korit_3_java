package ch12_inheritance.book;

public class book {
    /*
    부모 클래스 : Book
    자식 클래스 : Ebook
    실행 클래스 : BookMain

    지시 사항

    1.private title /author
    2. 생성자는 AllArsConstructor
    3. setter / getter

 Ebook 클래스에서
 Ebook 클래스는 Book을 상속 받아야 합니다.
 자식 필드로 private double fileSize / String format
    displayInfo() 메서드를 call1() 타입으로 정입합니다.
    예시
    저목 : 뭐시기
    저자 : 누구누구
    파일 크기 : 어쩌고 저쩌고 MB
    파일 형식 : PDF / EPUB ...

    BookMain 넘어가서
    Book 클래스의 인스턴스를 생성합니다.
    제목이랑 저자 출력합니다(Getter 사용)

 */
public class EBook extends Book {
    private double fileSize;
    private String format;


        public String getFormat() {
            return format;
        }

        public EBook() {
            super();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }

        public double getFileSize() {
            return fileSize;
        }
    }




}

