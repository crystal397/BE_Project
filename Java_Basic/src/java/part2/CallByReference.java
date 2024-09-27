package java.part2;

public class CallByReference {
    public static void main(String[] args) {
        float a=56.7f;
        float b=78.9f;
        floatAdd(a,b);
        System.out.println("finish");
    }
    public static void floatAdd(float a, float b) {
        float hap=a+b;
        System.out.println("hap = " + hap);
    }
}
