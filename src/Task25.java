
public class Task25 {

    public static void main(String[] args) {
        calculateFunction(3);
        calculateFunction(4);
        calculateFunction(1);
    }

    private static void calculateFunction(double x) {
        if (x <= 3) {
            System.out.println(x * x - 3 * x + 9);
        } else System.out.println(1 / (x * x * x + 6));
    }
}
