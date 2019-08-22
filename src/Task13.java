
public class Task13 {

    public static void main(String[] args) {
        System.out.println(function(5, 6));
    }

    private static double function(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }
}
