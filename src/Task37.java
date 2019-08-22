import java.util.Scanner;

public class Task37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int m = scanner.nextInt();
        scanner.nextLine();
        int n = scanner.nextInt();
        showDividers(m, n);
    }

    private static void showDividers(int m, int n) {
        boolean haveDivider = false;
        for (int i = m; i <= n; i++) {
            haveDivider = false;
            System.out.print("Делители числа " + i + " : ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    haveDivider = true;
                }
            }
            if (!haveDivider) {
                System.out.print("кроме 1 и самого числа делителей нет");
            }
            System.out.println();
        }
    }
}
