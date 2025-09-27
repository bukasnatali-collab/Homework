package by.homework.lessons.task3;

import java.util.Scanner;

public class Task2 {
    // x=x+5; y=y*9; z=z-6;
    // Необходимо укоротить данные выражения, чтобы результат не изменился
    // x=8; y=9; z=12; (операции присваивания, нужно просто написать по-другому)

    public static void main(String[] args) {

        double x = 8;
        double y = 9;
        double z = 12;

        // Используем операции присваивания
        x += 5;  // x = x + 5
        y *= 9;  // y = y * 9
        z -= 6;  // z = z - 6

        System.out.println("x после сложения с 5: " + x);
        System.out.println("y после умножения на 9: " + y);
        System.out.println("z после вычитания 6: " + z);
    }
}