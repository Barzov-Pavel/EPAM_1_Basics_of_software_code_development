
// 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:

public class Task16 {
    public static void main(String[] args) {
        function(2, 4);
        function(2, 4.1);
        function(-3.1, 4);
        function(0, 0);
        function(-1, 0);
    }

    private static void function(double x, double y) {
        if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
