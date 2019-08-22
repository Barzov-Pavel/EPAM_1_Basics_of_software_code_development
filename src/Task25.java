
// 5. Вычислить значение функции:
// F(x) = x^2 - 3x + 9, если x <= 3;
// 1/ (x^3 + 6), если x > 3;

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
