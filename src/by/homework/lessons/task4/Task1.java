package by.homework.lessons.task4;

public class Task1 {
    // На вход даны 3 числа. Вывести в консоль только четные числа


    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 8;
        int number3 = 26;


        if (number1 % 2 == 0) {
            System.out.println( "Четное число:" + number1);
        }
        if (number2 % 2 == 0) {
            System.out.println( "Четное число:" + number2);
        }
        if (number3 % 2 == 0) {
            System.out.println( "Четное число:" + number3);
        }
    }
}

