public class Main {
    public static void main(String[] args) {
        Nasabah n1 = new Nasabah("Siri",100.0,"192.168.10.1");
        Nasabah n2 = new Nasabah("Alexa",120.0,"172.15.22.33");
        
        n1.nabung(10.0);
        n1.ambilDuit(20.5);
        n1.ambilDuit(120.0);
        n1.showInfo();
        
        n2.nabung(20.5);
        n2.ambilDuit(11.7);
        n2.ambilDuit(2.5);
        n2.showInfo();

    }
}