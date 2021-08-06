import java.time.LocalDate;

public class ExemploLocalDate {

    public static void main(String[] args) {

        exemplo1();
        exemplo2();
    }

    public static void exemplo1() {

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);
    }

    public static void exemplo2() {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);

        System.out.println(ontem);
    }
}
