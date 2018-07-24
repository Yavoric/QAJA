package yavoric.Lessons06.Task04;

//import static sun.misc.Version.print;

public class Task4 {
    public static void main(String[] args) {
        Abonent abb1 = new Abonent("Иванов", "Иван", 23, "M" );
        Abonent abb2 = new Abonent(45678,"Петров", "Петр", 47, "F" );
        Abonent abb3 = new Abonent("Сидоров", "Сидр", 18, "F" );
        abb1.printAbonent();
        abb2.printAbonent();
        abb3.printAbonent();
        System.out.println(abb1.isEqual(abb2));
        System.out.println(abb1.isEqual(abb3));
        System.out.println(abb2.isEqual(abb3));



    }
}
