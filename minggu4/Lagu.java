class Lagu {
    private String pencipta;
    private String judul;

    public void isiParam(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }
    public void printLagu() {
        if (judul == null && pencipta == null) {
            return;
        }
        System.out.println("Judul : " + judul + ", Pencipta : " + pencipta);
    }
}