public class MataKuliah {
    String namaMK;
    private double uts, uas, tubes;

    double hitungNilai() {
        return 0.3 * uts + 0.4 * uas + 0.3 * tubes;
    }

    char hitungIndeks() {
        if (hitungNilai() >= 80) return 'A';
        else if (hitungNilai() >= 70) return 'B';
        else if (hitungNilai() >= 55) return 'C';
        else if (hitungNilai() >= 40) return 'D';
        else return 'E';
    }
}