public class Nasabah {
    private String nama;
    private double saldo;
    private String nomor;

    public Nasabah(String nama, double saldo, String nomor) {
        this.nama = nama;
        this.saldo = saldo;
        this.nomor = nomor;
    }

    public void showInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Nomor : " + nomor);
        System.out.println("Saldo : $" + saldo);
    }

    public void nabung(double duit) {
        saldo += duit;
        System.out.println("Jumlah saldo sekarang : $" + saldo);
    }

    public void ambilDuit(double jumlah) {
        if ((saldo - jumlah) < 10) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Sisa saldo anda : $" + saldo);
        }
    }

}