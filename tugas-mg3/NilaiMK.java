import java.util.Scanner;

class NilaiMK {
    String namaMK;
    double uts;
    double uas;
    double tubes;
    
    double hitungNilai() {
        return (0.3*uts)+(0.4*uas)+(0.3*uas);
    }

    String tentukanRange(double score) {
        String ret = "0";
        if (score >= 80 && score <= 100) {
            ret = "A";
        } else if (score >= 70 && score < 80) {
            ret = "AB";
        } else if (score >= 65 && score < 70) {
            ret = "B";
        } else if (score >= 60 && score < 65) {
            ret = "BC";
        } else if (score >= 50 && score < 60) {
            ret = "C";
        } else if (score >= 40 && score < 50) {
            ret = "D";
        } else {
            ret = "E";
        }
        return ret;
    }
    public static void main(String[] args) {
        double nilai_akhir = 0.0;
        NilaiMK mk1 = new NilaiMK();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama MK : ");
        mk1.namaMK = input.next();
        System.out.print("Masukan nilai UTS : ");
        mk1.uts = input.nextDouble();        
        System.out.print("Masukan nilai UAS : ");
        mk1.uas = input.nextDouble();
        System.out.print("Masukan nilai tubes : ");
        mk1.tubes = input.nextDouble();
        System.out.println("Mata Kuliah " + mk1.namaMK);
        System.out.println("Nilai UTS : " + mk1.uts + " (" + mk1.tentukanRange(mk1.uts)+ ") ");
        System.out.println("Nilai UAS : " + mk1.uas + " (" + mk1.tentukanRange(mk1.uas)+ ") ");
        System.out.println("Nilai Tubes : " + mk1.tubes + " (" + mk1.tentukanRange(mk1.tubes)+ ") ");
        nilai_akhir = mk1.hitungNilai();
        System.out.println("Nilai Akhir : " + nilai_akhir + " (" + mk1.tentukanRange(nilai_akhir)+ ") ");
        //System.out.println(mk1.tentukanRange(95));
        input.close();
    }
}