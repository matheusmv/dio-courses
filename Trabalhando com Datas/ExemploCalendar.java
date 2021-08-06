import java.util.Calendar;

public class ExemploCalendar {

    public static void main(String[] args) {

        exemplo1();
        exemplo2();
        exemplo3();
    }

    public static void exemplo1() {
        
        Calendar agora = Calendar.getInstance();

        System.out.println(agora);
    }

    public static void exemplo2() {

        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: " + agora.getTime());

        agora.add(Calendar.DATE, -15);

        System.out.println("15 dia atrás: " + agora.getTime());

        agora.add(Calendar.MONTH, 4);

        System.out.println("4 meses depois: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);

        System.out.println("2 anos depois: " + agora.getTime());
    }

    public static void exemplo3() {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);

        System.out.printf("%tF\n", agora);
        
        System.out.printf("%tD\n", agora);

        System.out.printf("%tr\n", agora);

        System.out.printf("%tT\n", agora);
    }
}
