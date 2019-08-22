import java.math.BigInteger;

public class Task34 {

    public static void main(String[] args) {
        mulFirstHundred();
    }

    private static void mulFirstHundred() {
        BigInteger integer = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            int x = i * i;
            integer = integer.multiply(new BigInteger(Integer.toString(x)));
        }
        System.out.println("Произведение квадратов первых двухсот чисел равна:\n" + integer);
    }
}
