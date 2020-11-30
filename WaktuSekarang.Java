import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class WaktuSekarang extends WaktuShalat {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Tanggal :");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(now));
        System.out.println("Jam saat ini :");
        DateTimeFormatter apf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(apf.format(now));
        WaktuShalat Time = new WaktuShalat();
        System.out.println("Shubuh     :" + Time.getShubuh());
        System.out.println("Terbit     :" + Time.getTerbit());
        System.out.println("Dhuhur     :" + Time.getDhuhur());
        System.out.println("Ashar      :" + Time.getAshar());
        System.out.println("Maghrib    :" + Time.getMaghrib());
        System.out.println("Isya'      :" + Time.getIsya());
    }
}