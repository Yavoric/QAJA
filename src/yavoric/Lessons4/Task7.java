package yavoric.Lessons4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Task7 {
    public static void main(String[] args) {
        String mail = inputMail();
        int i = checkEmail();
        outputMail (int, String);

    }
    //Функция ввода почты
    public static String inputMail(){
        System.out.println("ведите @-mail:");
        String str = new Scanner(System.in).nextLine();
        return str;
    }
    //Функция проверки почты
    public static int checkEmail(String Mail1){
        final Pattern pattern = Pattern.compile("^[A-Za-z.%+\\-]+@[A-Za-z.\\-]+\\.[A-Za-z]{2,4}");
        final Matcher matcher = pattern.matcher(mail1);
        if (matcher.find()){
            i=1;
        }
        else i=0;
        return i;
    }
    //Функция вывода результата
    public static void outputMail(int){
        if (i== 1) {
            System.out.println(mail + ": = Correct");
        }
        elese System.out.println(mail+ ": = Incorrect");
    }

}

public class Task7 {

}
