

public class Mahasiswa {
    private String nama;
    private String nim;
    private String alamat;

    public Mahasiswa(String n, String n1, String n2) {
        nama = n;
        nim = n1;
        alamat = n2;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
}