import java.util.Scanner;

class Bulan {
    int input;

    void show_bulan() {
        String bulan = "";
        if (input == 1) {
            bulan = "Januari";
        } else if (input == 2) {
            bulan = "Februari";
        } else if (input == 3) {
            bulan = "Maret";
        } else if (input == 4) {
            bulan = "April";
        } else if (input == 5) {
            bulan = "Mei";
        } else if (input == 6) {
            bulan = "Juni";
        } else if (input == 7) {
            bulan = "Juli";
        } else if (input == 8) {
            bulan = "Agustus";
        } else if (input == 9) {
            bulan = "September";
        } else if (input == 10) {
            bulan = "Oktober";
        } else if (input == 11) {
            bulan = "November";
        } else if (input == 12) {
            bulan = "Desember";
        }
        System.out.println("Bulan ke " + input + " adalah : " + bulan);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bulan cek = new Bulan();
        System.out.print("Masukan nomor bulan : ");
        cek.input = input.nextInt();
        cek.show_bulan();
    }
}