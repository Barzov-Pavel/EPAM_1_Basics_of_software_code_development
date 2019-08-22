
// 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
// он прямоугольным.

public class Task21 {

    public static void main(String[] args) {
        System.out.println(checkTriangle(90, 50));
        System.out.println(checkTriangle(45, 45));
        System.out.println(checkTriangle(150, 50));
    }

    private static String checkTriangle(int a, int b) {
        if ((a + b) >= 180) {
            return "Треугольник не существует";
        } else if (a == 90 || b == 90 || (a + b) == 90) {
            return "Треугольник существует, он прямоугольный";
        } else return "Треугольник существует, он не прямоугольный";
    }
}
