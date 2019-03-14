public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrMNS[] = new Manusia[3];
        Manusia objMns1 = new Manusia();

        objMns1.setNama("Markonah");
        objMns1.setUmur(76);

        Manusia objMns2 = new Manusia("Mat Conan");
        Manusia objMns3 = new Manusia("Bajuri",13);

        arrMNS[0] = objMns1;
        arrMNS[1] = objMns2;
        arrMNS[2] = objMns3;

        for (int i=0;i<3;i++) {
            System.out.println("Nama : " + arrMNS[i].getNama());
            System.out.println("Umur : " + arrMNS[i].getUmur());
            System.out.println();
        }
    }
}