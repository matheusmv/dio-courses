import java.time.Instant;
import java.util.Date;

public class ExemploInstant {

    public static void main(String[] args) {

        exemplo1();
    }

    public static void exemplo1() {
        
        Date dataInicio = new Date(1513124897691L);

        Instant instant = dataInicio.toInstant();

        System.out.println(instant);
    }
}
