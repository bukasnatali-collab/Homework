package task4;
import java.util.Scanner;
public class Task2 {
    // На вход даны 3 числа.
    // Вывести в консоль только те числа, которые делятся на 2 и на 5
    // (используйте оператор % для проверки деления без остатка)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int number3 = scanner.nextInt();


        if (number1 % 2 == 0 && number1 % 5 == 0) {
            System.out.println("Число " + number1 + " делится на 2 и на 5");;
            ;
        }
        if (number2 % 2 == 0 && number2 % 5 == 0) {
            System.out.println("Число " + number2 + " делится на 2 и на 5");;
            ;
        }
        if (number3 % 2 == 0 && number3 % 5 == 0) {
            System.out.println("Число " + number3 + " делится на 2 и на 5");
            ;
        }
    }
}

