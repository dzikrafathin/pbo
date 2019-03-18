public class Mahasiswa extends Person {
    private String nim;

    public Mahasiswa(String nama, String alamat, String nim) {
        super(nama,alamat);
        this.nim = nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }
}