package yavoric.Lessons06.Task04;
/*Реализовать класс Abonent, который имеет поля:
		long id; // необязательное поле, по умолчанию -1
		String firstName;
		String lastName;
		int age;
		char gender; // 'm' - male, 'f' - female

	Все поля должны быть помечены модификатором private
		- реализовать доступ к полям через методы set и get
		- реализовать возможность создания класса через два конструктора:
			1-> все поля, без обязательного поля "id"
			2-> полный конструктор со всем полями

	- реализовать метод void print(); вывода информации абонента в отформатированном виде
	- реализовать метод boolean isEquals(Abonent abonent); // вернут true, если id обоих объектов равны и не равны -1, false - в остальных случаях
	- протестировать метод isEquals
	*/
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
