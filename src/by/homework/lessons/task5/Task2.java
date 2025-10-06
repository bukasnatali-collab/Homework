package by.homework.lessons.task5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //  Ввести 2 положительных числа с консоли с помощью сканера.
        //  Вывести сумму всех чисел от одного числа до другого.
        //  (Используйте цикл while).Подсказка. До цикла объявите переменную int sum=0.
        //  В самом цикле перезаписывайте в эту переменную сумму чисел.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        int start, end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        int sum = 0;
        while (start <= end) {
            sum += start;
            start++;
        }

        System.out.println("Сумма чисел в диапазоне: " + sum);
    }
}