public class Robot {
    String tipe;
    int jumlah_roda;
    int jumlah_motor;
    String kontroller;

    void nyalain() {
        System.out.println("Nyala");
    }

    void matiin() {

    }

    void maju() {
        System.out.println("MAJU");
    }

    void mundur() {

    }

    void belok() {

    }
    public static void main(String[] args) {
        Robot penyerang1 = new Robot();
        Robot kiper = new Robot();
        penyerang1.jumlah_motor = 5;
        penyerang1.jumlah_roda = 3;
        penyerang1.kontroller = "Arduino";
        penyerang1.tipe = "Penyerang";
        kiper.jumlah_motor = 5;
        kiper.jumlah_roda = 3;
        kiper.kontroller = "Arduino";
        kiper.tipe = "Kiper";
        penyerang1.maju();
    }
}