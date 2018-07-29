//Работа с перечеслениями день недели
package yavoric.lessons08.task02;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        //DayOfWeek Data = inputDayOfWeek();

        DayOfWeek Data = DayOfWeek.SUNDAY;
        System.out.println("Вы выбрали день: "+Data.getName());
        System.out.println("Послезавтра будет: "+ Data.getDayAfterTomorrow());
        System.out.println("Позавчера была: " + Data.getDayBeforeYesterday());

    }


   /* private static DayOfWeek inputDayOfWeek() {
        DayOfWeek d11;
        System.out.println("Выберите день недели: 1-Понедельник 2-Вторник 3-Среда 4 -Четверг " +
                "5 -Пятница 6-Суббота 7 - Воскресенье");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                 d11= DayOfWeek.MONDAY;
                break;
            case 2:
                d11 = DayOfWeek.TUESDAY;
                break;
            case 3:
                d11 = DayOfWeek.WEDNESDAY;
                break;
            case 4:
                d11 = DayOfWeek.THURSDAY;
                break;
            case 5:
                d11 = DayOfWeek.FRIDAY;
                break;
            case 6:
                d11 = DayOfWeek.SATURDAY;
                break;
            case 7:
                d11 = DayOfWeek.SUNDAY;
                break;
            default:
                System.out.println("Такой день недели отсутствует");
        }
        return d11;
    }*/
}