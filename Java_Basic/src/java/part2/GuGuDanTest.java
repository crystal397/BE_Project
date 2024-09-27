package java.part2;

public class GuGuDanTest {
    public static void main(String[] args) {
        for(int i=2;i<=9;i++) {
            System.out.print(i + "단" + "\t\t");
        }
        System.out.println();

        for(int i=1;i<=9;i++){
            for(int j=2;j<=9;j++){
                System.out.printf("%d * %d = %d \t\t",j,i,(i*j));
            }
            System.out.println();
        }
    }
}
