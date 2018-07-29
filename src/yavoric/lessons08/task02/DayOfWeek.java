package yavoric.lessons08.task02;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private String name;
    DayOfWeek(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    //метод определения послезавтра
    public String getDayAfterTomorrow(){
        if (this.name.equals(MONDAY.name))
            return WEDNESDAY.name;
        if (this.name.equals(TUESDAY.name))
            return THURSDAY.name;
        if (this.name.equals(WEDNESDAY.name))
            return FRIDAY.name;
        if (this.name.equals(THURSDAY.name))
            return SATURDAY.name;
        if (this.name.equals(FRIDAY.name))
            return SUNDAY.name;
        if (this.name.equals(SATURDAY.name))
            return MONDAY.name;
        if (this.name.equals(SUNDAY.name))
            return TUESDAY.name;
        return "Ошибка";
    }
    //метод определения позавчера
    public String getDayBeforeYesterday(){
        if (this.name.equals(MONDAY.name))
            return SATURDAY.name;
        if (this.name.equals(TUESDAY.name))
            return SUNDAY.name;
        if (this.name.equals(WEDNESDAY.name))
            return MONDAY.name;
        if (this.name.equals(THURSDAY.name))
            return TUESDAY.name;
        if (this.name.equals(FRIDAY.name))
            return WEDNESDAY.name;
        if (this.name.equals(SATURDAY.name))
            return THURSDAY.name;
        if (this.name.equals(SUNDAY.name))
            return FRIDAY.name;
        return "Ошибка";
    }
}
