package by.homework.lessons.task6;

public class Task2 {
    // Создать массив из 5 чисел и заполните этот массив вручную.
    // Создайте второй массив с размерностью больше на 1 чем первый массив.
    // Необходимо скопировать первый массив со всеми значениями во второй массив.
    // Последний элемент во втором массиве пусть будет 0.
    // Выведите второй массив в консоль с помощью цикла for each.

    public static void main(String[] args) {
        int[] massive1 = {10, 20, 30, 40, 50};

        System.out.println("Первый массив:");
        for (int num : massive1) {
            System.out.print(num + " ");
        }

        int[] massive2 = new int[massive1.length + 1];

        for (int i = 0; i < massive1.length; i++) {
            massive2[i] = massive1[i];
        }

        massive2[massive2.length - 1] = 0;

        System.out.println("Второй массив:");
        for (int num : massive2) {
            System.out.print(num + " ");
        }
    }
}
