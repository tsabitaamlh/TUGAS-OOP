public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Nama  : ");
        String nama = input.nextLine();
        System.out.print("NIM   : ");
        String nim = input.nextLine();
        System.out.print("Nilai Tubes : ");
        double nilaiTubes = input.nextDouble();
        System.out.print("Nilai Quiz  : ");
        double nilaiQuiz = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS   : ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double nilaiUAS = input.nextDouble();

        NilaiMhs mahasiswa = new NilaiMhs(nama, nim, nilaiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);

        System.out.println("\nHasil perhitungan nilai mahasiswa:");
        mahasiswa.tampilkanInfoMahasiswa();

        input.close();
    }
}
