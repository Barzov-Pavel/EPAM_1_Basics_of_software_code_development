
public class Task32 {

    public static void main(String[] args) {
        calculateFunction(-5, 6, 1);
    }

    private static void calculateFunction(int a, int b, int h) {
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                System.out.println(i);
            } else System.out.println(-i);
        }
    }
}
