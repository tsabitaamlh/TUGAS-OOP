package model;

public class Prodi {
    private String id;
    private String nama;  // Anda dapat menambahkan atribut lain sesuai kebutuhan

    public Prodi(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }
}
