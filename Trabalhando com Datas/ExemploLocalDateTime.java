import java.time.LocalDateTime;

public class ExemploLocalDateTime {

    public static void main(String[] args) {

        exemplo1();
        exemplo2();
    }

    public static void exemplo1() {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
    }

    public static void exemplo2() {

        LocalDateTime agora = LocalDateTime.now();

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(agora);

        System.out.println(futuro);
    }
}
