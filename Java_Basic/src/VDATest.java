public class VDATest {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);

        int sum = 0;
        for(int i=1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        int x = 10;
        int y = 20;
        System.out.printf("x, y = %d, %d%n", x, y);
        int temp = x;
        x = y;
        y = temp;
        System.out.printf("x, y = %d, %d", x, y);
    }
}
