class Mahasiswa {
    String nama;
    long nim;
    double ipk;

    public Mahasiswa(String nama, long nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void display() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("IPK : " + ipk);
    }
}