package java.part2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("책 제목을 입력하세요:");
        String title=scan.nextLine();
        System.out.println("title = " + title);
        
        System.out.print("책 가격을 입력하세요:");
        int price=scan.nextInt();
        System.out.println("price = " + price);

        scan.nextLine(); // 문자열의 경우 버퍼비우기(스트림 비우기)가 진행되어야 깨끗한 상태로 다음을 진행 가능!!

        System.out.print("출판사를 입력하세요:");
        String company=scan.nextLine();
        System.out.println("company = " + company);

        System.out.print("저자를 입력하세요:");
        String author=scan.nextLine();
        System.out.println("author = " + author);

        System.out.print("책 페이지를 입력하세요:");
        int page=scan.nextInt();
        System.out.println("page = " + page);

        scan.nextLine();

        System.out.print("ISBN을 입력하세요:");
        String isbn=scan.nextLine();
        System.out.println("isbn = " + isbn);

        scan.close();
    }
}
