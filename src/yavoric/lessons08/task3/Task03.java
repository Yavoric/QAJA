//Работа с перечеслениями Сезон
package yavoric.lessons08.task3;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Season S = Season.AUTUMN;
        System.out.println("Вы выбрали сезон: "+S.getName());
        System.out.println("Следующий сезон будет: "+ S.geNextSeason());
        System.out.println("Прошлый сезон был: " + S.getPreviousSeason());

    }
}
