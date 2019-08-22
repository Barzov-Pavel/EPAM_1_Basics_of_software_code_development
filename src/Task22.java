
public class Task22 {

    public static void main(String[] args) {
        System.out.println(max(min(10, 15), min(500, 3)));
    }

    private static int min(int a, int b) {
        if (a < b) {
            return a;
        } else return b;
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else return b;
    }
}
