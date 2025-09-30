package by.homework.lessons.task3;

public class Task4 {
    // Даны значения: x=5; y=2; c=x*y;
    // Составте операции инкремента декремента так, чтобы после выполнения операции (c=x*y)
    // с = 12, x = 6, y = 1 Выведите полученные значения в консоль.

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int c = x * y; // 6 * 1 = 6, но это не 12...

        x++; // x становится 6
        y--; // y становится 1

        // Доп. операция для получения c = 12. Умножим с на 2
        c = c * 2;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("c = " + c);
    }
}
