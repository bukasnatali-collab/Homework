package task4;
import java.util.Scanner;
public class Task3 {
    // Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
    // Написать программу, которая будет выводит разный текст, в зависимости от значения result.
    // В случае result=3, вывести: "Результат деления равен 3"
    // В случае result=5 вывести: "Результат деления равен 5"
    // В других случаях вывести: "Результат деления равен дробному числу".
    // При этом в последнем случае вывести точный результат деления (использовать приведение типов)
    // Для выполнения задания использовать оператор switch- case

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();

        double result = 15/x;
        switch ((int) result)  {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу");
                System.out.println("Точный результат: " + result);
        }
    }
}

