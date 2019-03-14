class Triangle implements Shape {
    private double alas;
    private double tinggi;
    private double sisi_miring;

    public void setAttr(double alas, double tinggi, double sisi_miring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi_miring = sisi_miring;
    }

    public double hitungLuas() {
        double luas = (alas * tinggi)/2;
        return luas;
    }

    public double hitungKeliling() {
        double kel = (alas + tinggi + sisi_miring);    
        return kel;
    }
}