package by.homework.lessons.task3;

import java.util.Scanner;

public class Task3 {
    // Даны числа a=35, b=65. Если а>b, то присвоить числу c значение 5. Иначе, присвоить числу c значение 10.
    // (тернальный оператор) if else

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        int c;

        // if else
        if (a > b) {
            c = 5;
            System.out.println("Присваиваем с = 5");
        } else {
            c = 10;
            System.out.println("Присваиваем с = 10");

        }
    }
}