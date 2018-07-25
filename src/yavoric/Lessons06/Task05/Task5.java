package yavoric.Lessons06.Task05;
/*Создать класс Date, который имеет следующие поля:
		- день
		- месяц
		- год

		Все поля должны быть помечены модификатором private
		- реализовать доступ к полям через методы set и get
		-* реализовать статический метод checkData(int day, int month, int year), который проверяет существование введенной даты
		-* использовать проверку checkData, при попытке изменить поле метод set, в случае ошибки не проводить изменение,
			а вывести сообщение об ошибке на консоль
		-** реализовать метод differenceIdDays(int day, int month, int year), который принимает другую дату и вычисляет разницу в
			днях между датами
		- протестировать работу методов*/
public class Task5 {
    public static void main(String[] args) {
        Data d1 = new Data (10,10,2010);
        Data d2 = new Data (11,18,1700);
        Data d3 = new Data (14,11,2008);
        d1.printData();
        d2.printData();
        d3.printData();
        d1.differenceIdDays(d3);
        System.out.println(d1);
        System.out.println(d1);
        System.out.println(d1);

    }
}
