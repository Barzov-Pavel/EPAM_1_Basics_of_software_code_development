
// 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// ((b + √(b^2 + 4ac))/ 2a) - a^3 * c + b^-2

public class Task12 {

    public static void main(String[] args) {
        System.out.println(function(3, 3, 5));
    }

    private static double function(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
