package yavoric.Lessons2;
/*программа ввода с клавиатуры последовательно 3 чисел. Вывести
		минимальное максимальное и средние значения
*/
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        intputNumberScreen ();
        searchMinMaxMin ();
        outputNumberScreen ();
    }
    //Функция ввода трех чисел
    public static void intputNumberScreen (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        Variable2.a = scanner.nextInt();
        System.out.println("Введите число B");
        Variable2.b= scanner.nextInt();
        System.out.println("Введите число C");
        Variable2.c = scanner.nextInt();
    }
    //Функция нахождения МИН, МАКС, СРЕДН числа
    public static void searchMinMaxMin (){
        Variable2.midnumber = (Variable2.a + Variable2.b + Variable2.c) / 3;
        if (Variable2.a == Variable2.b && Variable2.b == Variable2.c)
            System.out.print("Введенные числа равны ");
        else if (Variable2.a > Variable2.b && Variable2.b > Variable2.c) {
            Variable2.maxnumber = Variable2.a;
            Variable2.minnumber = Variable2.c;
        } else if (Variable2.b > Variable2.a && Variable2.a > Variable2.c) {
            Variable2.maxnumber = Variable2.b;
            Variable2.minnumber = Variable2.c;
        } else if (Variable2.c > Variable2.a && Variable2.a > Variable2.b) {
            Variable2.maxnumber = Variable2.c;
            Variable2.minnumber = Variable2.b;
        } else if (Variable2.a > Variable2.c && Variable2.c > Variable2.b) {
            Variable2.maxnumber = Variable2.a;
            Variable2.minnumber = Variable2.b;
        } else if (Variable2.b > Variable2.c && Variable2.c > Variable2.a) {
            Variable2.maxnumber = Variable2.b;
            Variable2.minnumber = Variable2.a;
        } else if (Variable2.c > Variable2.b && Variable2.b > Variable2.a) {
            Variable2.maxnumber = Variable2.c;
            Variable2.minnumber = Variable2.a;
        }
    }
    //Функция вывода чисел на экран
    public static void outputNumberScreen (){
        System.out.println("Максимальное число = " + Variable2.maxnumber);
        System.out.println("Минимальное число = " + Variable2.minnumber);
        System.out.println("Среднее значение = " + Variable2.midnumber);
    }
}


