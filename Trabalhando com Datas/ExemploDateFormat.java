import java.text.DateFormat;
import java.util.Date;

public class ExemploDateFormat {

    public static void main(String[] args) {

        exemplo1();
    }

    public static void exemplo1() {
        Date agora = new Date();

        String dateToString = DateFormat.getInstance().format(agora);

        System.out.println(dateToString);

        dateToString = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);

        System.out.println(dateToString);

        dateToString = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);

        System.out.println(dateToString);
    }
}
