public class Bintang {
    private String bahan;
    private String topping;
    private String rasa;

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void shBintang() {
        System.out.println("Bahan : " + bahan);
        System.out.println("Rasa : " + rasa);
        System.out.println("Topping : ")
    }
}