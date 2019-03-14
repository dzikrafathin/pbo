class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Edward",192034);
        Mahasiswa mhs2 = new Mahasiswa("Kenway",233345);
        mhs1.ipk = 3.4;
        mhs2.ipk = 3.6;
        mhs1.display();
        mhs2.display();
    }
}