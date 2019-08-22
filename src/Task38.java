
// 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.HashSet;

public class Task38 {

    public static void main(String[] args) {
        findEqualNumber(123456, 987654);
    }

    private static void findEqualNumber(int a, int b) {
        String first = Integer.toString(a);
        String second = Integer.toString(b);
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < first.length(); i++) {
            String local = Character.toString(first.charAt(i));

            if (second.contains(local)) {
                set.add(first.charAt(i));
            }
        }

        for (Character character : set) {
            System.out.print(character + " ");
        }
        System.out.println();
    }
}
