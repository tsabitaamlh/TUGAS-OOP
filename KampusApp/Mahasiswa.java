public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private String asal;

    public Mahasiswa(String nim, String nama, String kelas, String asal) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.asal = asal;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getKelas() {
        return this.kelas;
    }

    public String getAsal() {
        return this.asal;
    }
}