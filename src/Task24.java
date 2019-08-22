
// 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
// отверстие.

public class Task24 {

    public static void main(String[] args) {
        checkBrick(3, 2, 7, 3, 1);
        checkBrick(3, 2, 7, 3, 10);
    }

    private static void checkBrick(double a, double b, double x, double y, double z) {

        if (((x <= a) || (x <= b)) && ((y <= b) || (y <= a)))
            System.out.println("Кирпич проходит в отверстие");
        else if (((x <= a) || (x <= b)) && ((z <= b) || (z <= a)))
            System.out.println("Кирпич проходит в отверстие");
        else if (((z <= a) || (z <= b)) && ((y <= b) || (y <= a)))
            System.out.println("Кирпич проходит в отверстие");
        else System.out.println("Кирпич не проходит в отверстие");
    }
}
