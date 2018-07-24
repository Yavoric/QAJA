package yavoric.Lessons06.Task04;
//Создание класса абонент

public class Abonent {
    private long id = -1; // необязательное поле, по умолчанию -1
    private String firstName;
    private String lastName;
    private int age;
    private String gender ; // 'm' - male, 'f' - female
//Конструктор без ID
    public Abonent(String firstName,String lastName,int age,String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    //Конструктор с ID
    public Abonent(long id, String firstName,String lastName,int age,String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    //метод вывода Абонента
    public void printAbonent() {
        System.out.println("Имя Абонента " + firstName+ " " + lastName);
        System.out.println("Код= " + id+ " Возраст= " + age + " Пол " + gender);
        System.out.println("*************************************************");

    }
    public boolean isEqual(Abonent other) {
        if (this.id == other.id && this.id != -1 && other.id !=-1) {
            return true;
        }
        return false;
    }
}
