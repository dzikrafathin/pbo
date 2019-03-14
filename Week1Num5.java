public class Week1Num5 {
    public static void main(String[] args) {
        MataKuliah mk = new MataKuliah();
        mk.namaMK = "Bahasa Inggriss";  
        mk.tubes = -70;
        mk.uas = 130;
        mk.uts = 1700;
        System.out.println(mk.namaMK);
        System.out.println(mk.uas);
        System.out.println(mk.uts);
        System.out.println(mk.tubes);
        System.out.println(mk.hitungNilai());
        System.out.println(mk.hitungIndeks());
    }
}