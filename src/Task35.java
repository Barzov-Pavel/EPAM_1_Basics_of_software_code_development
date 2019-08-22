import java.util.Scanner;

public class Task35 {

    public static void main(String[] args) {
        double sum1 = 0;
        int x = 1;
        int y = x;
        double n = 1;
        float eps;
        System.out.println("Число: ");
        Scanner scanner = new Scanner(System.in);
        eps = scanner.nextFloat();
        while (x != 0) {
            sum1 += (1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n)));
            if ((Math.abs(sum1) >= eps) && (y >= 2))
                x = 0;
            n++;
            y++;
            if (y == 100) x = 0;
        }
        if (y == 100)
            System.out.println("Нет такого числа");
        else
            System.out.println("Равно: " + sum1);
    }


}
