package yavoric.lessons07.task01;

public class Task1 {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data(11, 18, 1700);
        Data d3 = new Data(14, 11, 2008);
        d1.printData();
        d1.setData(20,8,1980);
        d1.printData();
        d2.printData();
        d3.printData();
        System.out.println(d1);
        System.out.println(d1);
        System.out.println(d1);
        DataTime dt1 = new DataTime(20,55,55);
        dt1.printTime();
        System.out.println(dt1.checkTime(28,59,59));
        dt1.printTime();

    }
}