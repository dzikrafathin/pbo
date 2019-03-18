public class Main {
    public static void main(String[] args) {
        Mahasiswa mh1 = new Mahasiswa("Dzikra Fathin", "Bekasi", "1805039");
        System.out.println("Nama\t:\t" + mh1.getNama());
        System.out.println("Alamat\t:\t" + mh1.getAlamat());
        System.out.println("NIM\t:\t" + mh1.getNim());
    }
}