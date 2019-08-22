
// 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
// данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.

public class Task15 {

    public static void main(String[] args) {
        function(3661);
    }

    private static void function(int seconds) {
        int sec = seconds % 60;
        seconds = seconds / 60;
        int min = seconds % 60;
        seconds = seconds / 60;
        System.out.println(seconds + "ч " + min + "мин " + sec + "с");
    }
}
