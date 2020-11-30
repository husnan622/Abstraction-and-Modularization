public class WaktuShalat {
    private String Shubuh, Terbit, Dhuhur, Ashar, Maghrib, Isya;

    WaktuShalat() {
        this.Shubuh = "05.00:00";
        this.Terbit = "06.18:00";
        this.Dhuhur = "12.18:00";
        this.Ashar = "15.37:00";
        this.Maghrib = "18.17:00";
        this.Isya = "19.27:00";
    }

    String getShubuh() {
        return Shubuh;
    }

    String getTerbit() {
        return Terbit;
    }

    String getDhuhur() {
        return Dhuhur;
    }

    String getAshar() {
        return Ashar;
    }

    String getMaghrib() {
        return Maghrib;
    }

    String getIsya() {
        return Isya;
    }
}