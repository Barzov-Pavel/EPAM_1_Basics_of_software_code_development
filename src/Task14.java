import java.text.DecimalFormat;

public class Task14 {

    public static void main(String[] args) {
        function(-555.666);
    }

    private static void function(double x) {
        x = (int)x/1000.0 + (x-(int)x) * 1000;
        System.out.println(new DecimalFormat("#0.000").format(x));
    }
}
