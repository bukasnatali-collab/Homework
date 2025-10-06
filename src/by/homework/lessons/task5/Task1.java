package by.homework.lessons.task5;

public class Task1 {
    //  Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100. (можно использовать цикл for)

    public static void main(String[] args) {
        System.out.println("Числа кратные 7 или 3:");

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0) {

                if (i % 7 == 0 && i % 3 == 0) {
                    System.out.println(i + " (кратно и 3 и 7)");
                } else if (i % 7 == 0) {
                    System.out.println(i + " (кратно 7)");
                } else {
                    System.out.println(i + " (кратно 3)");
                }
            }
        }
    }
}
