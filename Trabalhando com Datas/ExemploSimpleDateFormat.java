import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploSimpleDateFormat {

    public static void main(String[] args) {

        exemplo1();
        exemplo2();
    }

    public static void exemplo1() {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }

    public static void exemplo2() {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
