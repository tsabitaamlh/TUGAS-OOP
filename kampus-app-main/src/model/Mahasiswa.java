package model;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String idProdi;  // Tambahkan atribut idProdi

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getIdProdi() {
        return idProdi;
    }

    public void setIdProdi(String idProdi) {
        this.idProdi = idProdi;
    }

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
}
