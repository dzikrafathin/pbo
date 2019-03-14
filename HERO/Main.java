public class Main {
    public static void main(String[] args) {
        Hero cortana = new Hero("Cortana",110,120);
        Hero jarvis = new Hero("Jarvis",140,160);

        cortana.showInfo();
        jarvis.showInfo();

        for (int i=0;i<15;i++) {
            cortana.attack();
            cortana.defense();
            jarvis.attack();
            jarvis.defense();
        }
    }
}