import java.time.LocalTime;

public class ExemploLocalTime {

    public static void main(String[] args) {

        exemplo1();
        exemplo2();
    }

    public static void exemplo1() {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
    }

    public static void exemplo2() {

        LocalTime agora = LocalTime.now();

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(agora);

        System.out.println(maisUmaHora);
    }
}
