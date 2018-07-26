package yavoric.lessons07.task01;

public class Data {
    private int day;
    private int month;
    private int year;

    //Конструктор по умолчанию инициировать 1 января 1970
    public Data() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Метод SET с проверкой корректности введенной даты
    public void setData(int day, int month, int year) {
        if (year > 0 && year < 3051) {
            switch (month) {
                case 1:
                    if (day > 0 && day < 31) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 2:
                    if (day > 0 && day < 28) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 3:
                    if (day > 0 && day < 31) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 4:
                    if (day > 0 && day < 30) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 5:
                    if (day > 0 && day < 31) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 6:
                    if (day > 0 && day < 30) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 7:
                    if (day > 0 && day < 31) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 8:
                    if (day > 0 && day < 31) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 9:
                    if (day > 0 && day < 30) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 10:
                    if (day > 0 && day < 31) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 11:
                    if (day > 0 && day < 30) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                case 12:
                    if (day > 0 && day < 31) {
                        this.day = day;
                    } else {
                        System.out.println("Дата не верна");
                    }
                default:
                    System.out.println("Месяц не правельный");
            }
        } else {
            System.out.println("Год не верен");
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    /* public int nextDay();{
         this.day++;
     }
     public int nextMonth(){

     }
     public int nextYear(){

     }*/
    public void printData() {
        System.out.println("Дата " + day + "." + month + "." + year + "г.");
        System.out.println("****************************************");
    }
    @Override
    public String toString() {
        return "Дата" +
                day +"/"+
                month +"/"+
                year;
    }
}

