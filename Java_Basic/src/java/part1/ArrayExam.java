package java.part1;

public class ArrayExam {
    public static void main(String[] args) {
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = i+1;
            System.out.println(a[i]);
        }

        char[] c = {'A','P','P','L','E'};
        for(int i=0;i<c.length;i++){
            System.out.print((char)(c[i]+32));
        }
    }
}
