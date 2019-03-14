public class Hero {
    
    private String nama;
    private double health, power;

    public Hero(String nama, double health, double power) {
        this.nama = nama;
        this.health = health;
        this.power = power;
    }

    public void showInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Health : " + health);
        System.out.println("Power : " + power);
    }

    public void attack() {
        if (power > 10) {
            System.out.println(nama + "Attacking .... ");
            power -= 10;
        } else {
            System.out.println(nama + "Not Enough energy ....");
        }
    }

    public void defense() {
        if (power < 10 | health < 10) {
            System.out.println(nama + "Not enough power or energy");
        } else {
            System.out.println(nama + "Defense mode ....");
            power -= 10;
            health -= 10;
        }
    }
}