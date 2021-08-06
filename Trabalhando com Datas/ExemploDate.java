import java.util.Date;

public class ExemploDate {

    public static void main(String[] args) {

        exemplo1();
        exemplo2();
        exemplo3();
        exemplo4();
        exemplo5();
    }

    public static void exemplo1() {

        Date novaData = new Date();

        System.out.println(novaData);  // Fri Aug 06 15:30:13 BRT 2021
    }

    public static void exemplo2() {

        final long time = System.currentTimeMillis();

        Date novaData = new Date(time);

        System.out.println(novaData);  // Fri Aug 06 15:30:13 BRT 2021
    }

    public static void exemplo3() {

        Date dataNoPassado = new Date(1513124897691L);

        Date dataNoFuturo = new Date(1613124807691L);

        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isAfter);

        System.out.println(isBefore);
    }

    public static void exemplo4() {

        Date data1 = new Date(1613124807691L);

        Date data2 = new Date(1613124807691L);

        boolean isEquals = data1.equals(data2);

        System.out.println(isEquals);
    }

    public static void exemplo5() {

        Date dataNoPassado = new Date(1513124897691L);

        Date data1 = new Date(1613124807691L);

        Date data2 = new Date(1613124807691L);

        int compareCase1 = dataNoPassado.compareTo(data1);

        int compareCase2 = data1.compareTo(dataNoPassado);

        int compareCase3 = data1.compareTo(data2);

        System.out.println(compareCase1);

        System.out.println(compareCase2);

        System.out.println(compareCase3);
    }
}
