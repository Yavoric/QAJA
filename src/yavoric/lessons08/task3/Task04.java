//Работа с перечислением месяц
package yavoric.lessons08.task3;
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Month M = Month.SEPTEMBER;
        System.out.println("Вы выбрали месяц: " + M.getNameRUS() + ";  По украински: " + M.getNameUKR() +"; Кол-во дней: "+
                           M.getQuantity()+";  Сезон: " + M.getSeasonMonth());
        System.out.println("Следующий месяц будет: " + M.getNextMonth());
        System.out.println("Прошлый месяц был: " + M.getPreviousMonth());
        //ТЕСТОВЫЕ МЕСЯЦЫ
        Month[] testM = new Month[3];//ТЕСТОВЫЕ МЕСЯЦЫ
        testM[0].setName("JANUARY");
        testM[1].setName("JUNE");
        testM[2].setName("NOVEMBER");
        Month[] testM1 = new Month[3];//ТЕСТОВЫЕ МЕСЯЦЫ функции следующий месяц
        testM1[0].setName("FEBRUARY");
        testM1[1].setName("JULY");
        testM1[2].setName("DECEMBER");
        Month[] testM2 = new Month[3];////ТЕСТОВЫЕ МЕСЯЦЫ предыдущий месяц
        testM2[0].setName("DECEMBER");
        testM2[1].setName("MAY");
        testM2[2].setName("OCTOBER");
        Month[] testM3 = new Month[3];//ТЕСТОВЫЕ МЕСЯЦЫ сезон
        testM3[0].setName("WINTER");
        testM3[1].setName("SUMMER");
        testM3[2].setName("AUTUMN");
        System.out.println("****************************************************************************************");
        //testGetSeasonMonth(Month.);
       // testGetNextMonth();
      //  testGetPreviousMonth();
    }
    //Метод тестирования следующего месяца
/*private static boolean testGetSeasonMonth(Month){
    for ( int i=0; i<3; i++){
        if (testM[i].get)

    }
}*/
}
