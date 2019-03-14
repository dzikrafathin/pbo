public class Buku {
    private String pengarang;
    private String judul;

    private Buku() {
        this("CCX8","DR.RTFONE");
    }
    
    private Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    private void printBuku() {
        System.out.println("Judul : " + judul + " Pengarang : " + pengarang);
    }
    
    public static void main(String[] args) {
        Buku a,b;
        a = new Buku("DESCRETE","VON FOUS X");
        b = new Buku();
        a.printBuku();
        b.printBuku();
    }
}