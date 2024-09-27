public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        for(int i=0;i<b.length;i++){
            b[i]=new Book();
        }
        
        b[0].title="AI";
        b[0].price=30000;
        b[0].company="yeardream";
        b[0].author="crystal";
        b[0].page=500;
        b[0].isbn="11889900";

        b[1].title="DE";
        b[1].price=30000;
        b[1].company="yeardream";
        b[1].author="crystal";
        b[1].page=500;
        b[1].isbn="11889901";

        b[2].title="DS";
        b[2].price=30000;
        b[2].company="yeardream";
        b[2].author="crystal";
        b[2].page=500;
        b[2].isbn="11889902";
        
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].title+"\t"+b[i].price+"\t"+b[i].company+"\t"+b[i].author+"\t"+b[i].page+"\t"+b[i].isbn);
        }
    }
}
