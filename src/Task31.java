
// 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
// все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число до которого будет происходить суммирование");
        int a = scanner.nextInt();
        sumNumbers(a);
    }

    private static void sumNumbers(int a) {
        int local = 0;
        for (int i = 1; i <= a; i++) {
            local += i;
        }
        System.out.println("Сумма чисел: " + local);
    }
}
