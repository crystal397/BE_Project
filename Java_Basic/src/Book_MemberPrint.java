public class Book_MemberPrint {
    public static void main(String[] args) {
        // 객체(인스턴스) 생성
        Book b = new Book();
        b.title="java";
        b.price=30000;
        b.company="fastcampus";
        b.author="crystal";
        b.page=700;
        b.isbn="1199110";
        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\t"+b.author+"\t"+b.page+"\t"+b.isbn);

        Member m = new Member();
        m.name="홍길동";
        m.age=30;
        m.tel="010-111-1111";
        m.mail="fc@naver.com";
        m.addr="Seoul";
        m.weight=57.6f;
        System.out.println(m.name+"\t"+m.age+"\t"+m.tel+"\t"+m.mail+"\t"+m.addr+"\t"+m.weight);
    }
}
