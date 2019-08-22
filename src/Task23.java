
public class Task23 {

    public static void main(String[] args) {
        checkLine(1, 1, 1, 2, 1, 3);
        checkLine(1, 1, 1, 2, 1, 7);
        checkLine(1, 1, 2, 2, 1, 7);
    }

    private static void checkLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow((Math.abs(y1 - y2)), 2));
        double b = Math.sqrt(Math.pow(Math.abs(x2 - x3), 2) + Math.pow((Math.abs(y2 - y3)), 2));
        double c = Math.sqrt(Math.pow(Math.abs(x1 - x3), 2) + Math.pow((Math.abs(y1 - y3)), 2));

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        if (s == 0) {
            System.out.println("Точки лежат на одной прямой");
        } else System.out.println("Точки не лежат на одной прямой");
    }
}
