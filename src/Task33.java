
// 3. Найти сумму квадратов первых ста чисел.

public class Task33 {

    public static void main(String[] args) {
        sumFirstHundred();
    }

    private static void sumFirstHundred() {
        int local = 0;
        for (int i = 1; i <= 100; i++) {
            local += i * i;
        }
        System.out.println("Сумма квадратов первых ста чисел равна: " + local);
    }
}
