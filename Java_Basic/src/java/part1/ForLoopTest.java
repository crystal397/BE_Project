package java.part1;

public class ForLoopTest {
    public static void main(String[] args) {
        for(char c='A';c<='Z';c++){
            System.out.println(c + " : " + (int)c);
        }

        for(char c='a';c<='z';c++){
            System.out.println(c + " : " + (int)c);
        }

        for(int i=65;i<=90;i++){
            System.out.println((char)i + " : " + i);
        }
        
        int[] numbers = new int[10];
        for(int i=0;i<10;i++){
            numbers[i] = i+1;
        }
        for(int su : numbers){
            System.out.println("su = " + su);
        }
    }
}
