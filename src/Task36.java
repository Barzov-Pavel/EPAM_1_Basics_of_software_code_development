
// 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task36 {

    public static void main(String[] args) {
        showLetters();
    }

    private static void showLetters() {
        for (int i = 65; i < 91; i++) {
            char c = (char)i;
            System.out.println(c + " - " + i);
        }

        System.out.println();

        for (int i = 97; i < 123; i++) {
            char c = (char)i;
            System.out.println(c + " - " + i);
        }
    }
}
