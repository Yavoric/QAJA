package yavoric.Lessons2;
/*программа ввода с клавиатуры последовательно 3 чисел. Вывести
		минимальное максимальное и средние значения
*/
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        int a = scanner.nextInt();
        System.out.println("Введите число B");
        int b = scanner.nextInt();
        System.out.println("Введите число C");
        int c = scanner.nextInt();
        double d1 = (a + b + c) / 3;
        if (a == b && b == c)
            System.out.print("Введенные числа равны ");
        else if (a > b && b > c) {
            System.out.println("Максимальное число " + a);
            System.out.println("Минимальное число " + c);

        } else if (b > a && a > c) {
            System.out.println("Максимальное число" + b);
            System.out.println("Минимальное число" + c);
        } else if (c > a && a > b) {
            System.out.println("Максимальное число" + c);
            System.out.println("Минимальное число" + b);
        } else if (a > c && c > b) {
            System.out.println("Максимальное число" + a);
            System.out.println("Минимальное число" + b);
        } else if (b > c && c > a) {
            System.out.println("Максимальное число" + b);
            System.out.println("Минимальное число" + a);
        } else if (c > b && b > a) {
            System.out.println("Максимальное число" + c);
            System.out.println("Минимальное число" + a);
        }
        System.out.println("Среднее значение" + d1);
    }
}

