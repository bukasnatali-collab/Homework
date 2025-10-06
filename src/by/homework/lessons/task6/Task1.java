package by.homework.lessons.task6;

public class Task1 {
    //  Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
    //  Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29};

        for (int number : numbers) {
            System.out.print("Исходный массив:" + number + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                numbers[i] = 0;
            }
        }

        for (int number : numbers) {
            System.out.print("Массив после замены нечётных индексов:" + number + " ");
        }
    }
}
