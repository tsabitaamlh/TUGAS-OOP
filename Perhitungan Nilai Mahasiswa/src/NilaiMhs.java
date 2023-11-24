import java.util.Scanner;

public class NilaiMhs {
    private String nama;
    private String nim;
    private double nilaiTubes;
    private double nilaiQuiz;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public NilaiMhs(String nama, String nim, double nilaiTubes, double nilaiQuiz, double nilaiTugas,
            double nilaiUTS, double nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTubes = nilaiTubes;
        this.nilaiQuiz = nilaiQuiz;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double hitungTotalNilai() {
        return (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);
    }

    public void tampilkanInfoMahasiswa() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek : " + hitungTotalNilai());
    }
}
