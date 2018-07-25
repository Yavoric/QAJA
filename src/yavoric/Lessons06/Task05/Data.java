package yavoric.Lessons06.Task05;
//Создаем класс Дата
public class Data {
        private int day;
        private int month;
        private int year;

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //Конструктор
    public Data(int day,int month,int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void printData() {
        System.out.println("Дата " + day + "." + month + "." + year + "г.");
        System.out.println("****************************************");
    }
    //метод проверки существования даты
    /*public int checkData (int day, int month, int year) {
        int d = day;
        int y = year;
        int m = month;
        if (y>1899 && y<2049) {
            this.year = y;
        }
        else

    }*/
    //метод вычисляет колво дней между датами считая, что в месяце 30 дней, в году 365 дней
    public void differenceIdDays(Data other){
        int period = (this.day + this.month*30+this.year*365)-(other.day+other.month*30+other.year*365);
        System.out.println("разница дней между "+this.day +"."+ this.month+"."+this.year+"г. и "+other.day
                            +"."+other.month+"."+other.year+"г.");
        System.out.println("Составляет " + Math.abs(period));

    }

    @Override
    public String toString() {
        return "Дата" +
                day +"/"+
                month +"/"+
                year;
    }
}
