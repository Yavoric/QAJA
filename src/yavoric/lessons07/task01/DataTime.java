package yavoric.lessons07.task01;

public class DataTime extends Data{
    private int sec;
    private int min;
    private int hour;

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHaur() {
        return hour;
    }

    public void setHaur(int haur) {
        this.hour = haur;
    }

    public DataTime(int hour,int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;

    }

    //реализовать метод checkTime(int hour, int minute, int second), который проверяет существование введенного времени
    public boolean checkTime(int hour, int minute, int second){
        if (second>0 &&second<61) {
            this.sec = second;
        }else return false;
        if (minute>0 &&minute<61) {
            this.min = minute;
        }else return false;
        if(hour>0 &&hour<25) {
            this.hour = hour;
        }else return false;
        return true;
    }
    public void printTime(){
        System.out.print("время" +hour+":"+min+":"+sec);
    }

}
