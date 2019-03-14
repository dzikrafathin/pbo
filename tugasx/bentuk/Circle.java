class Circle implements Shape {
    private double jari2x;
    public void setJari2x(double jari2x) {
        this.jari2x = jari2x;
    }

    public double hitungLuas() {
        double luas = Pi * Math.pow(jari2x,2);
        return luas;
    }

    public double hitungKeliling() {
        double kel = Pi * 2 * jari2x;
        return kel;
    }
}