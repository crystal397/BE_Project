import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("책 제목을 입력하세요:");
        String title=scan.next();
        System.out.println("title = " + title);
        
        System.out.print("책 가격을 입력하세요:");
        int price=scan.nextInt();
        System.out.println("price = " + price);

        System.out.print("출판사를 입력하세요:");
        String company=scan.next();
        System.out.println("company = " + company);

        System.out.print("저자를 입력하세요:");
        String author=scan.next();
        System.out.println("author = " + author);

        System.out.print("책 페이지를 입력하세요:");
        int page=scan.nextInt();
        System.out.println("page = " + page);

        System.out.print("ISBN을 입력하세요:");
        String isbn=scan.next();
        System.out.println("isbn = " + isbn);

        scan.nextLine(); //버퍼 비우기
        scan.close();
    }
}
