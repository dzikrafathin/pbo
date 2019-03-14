class Square implements Shape {
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        double luas = sisi * sisi;
        return luas;
    }

    public double hitungKeliling() {
        double kel = 4 * sisi;
        return kel;
    }
}