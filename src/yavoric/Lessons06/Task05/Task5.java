package yavoric.Lessons06.Task05;

public class Task5 {
    public static void main(String[] args) {
        Data d1 = new Data (10,10,2010);
        Data d2 = new Data (11,18,1700);
        Data d3 = new Data (14,11,2008);
        d1.printData();
        d2.printData();
        d3.printData();
        d1.differenceIdDays(d3);

    }
}
