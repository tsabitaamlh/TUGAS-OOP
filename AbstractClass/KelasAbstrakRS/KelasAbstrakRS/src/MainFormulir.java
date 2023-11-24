public class MainFormulir {
    public static void main(String[] args) {
        System.out.println();
        FormulirPasien formulir01 = new FormulirPasien();
        formulir01.Nama = "Arkan";
        formulir01.Nohp = "085765424";
        formulir01.Alamat = "12 Januari 2003";
        formulir01.NIK = "872556425";
        formulir01.NoKTP = "8721645136";
        formulir01.jenisKelamin = "Perempuan";
        formulir01.tanggalLahir = "12 Januari 2003";
        System.out.println("Nama Pasien :" + formulir01.Nama);
        System.out.println("No hp pasien:" + formulir01.Nohp);
        System.out.println("Alamat Pasien :" + formulir01.Alamat);
        System.out.println("NIK Pasien :" + formulir01.NIK);
        System.out.println("NO ktp Pasien :" + formulir01.NoKTP);
        System.out.println("Jenis Kelamin Pasien :" + formulir01.jenisKelamin);
        System.out.println("tanggal lahir :" + formulir01.tanggalLahir);
        formulir01.Pembayaran();
        formulir01.Peraturan();

        System.out.println();
        FormulirDokter formulir02 = new FormulirDokter();
        formulir02.Nama = "Arkan";
        formulir02.Nohp = "085765424";
        formulir02.Alamat = "12 Januari 2003";
        formulir02.NoKTP = "8721645136";
        formulir02.kodeDokter = "8721645136";
        System.out.println("Nama dokter :" + formulir02.Nama);
        System.out.println("No hp dokter:" + formulir02.Nohp);
        System.out.println("Alamat dokter :" + formulir02.Alamat);
        System.out.println("NO ktp dokter :" + formulir02.NoKTP);
        System.out.println("Kode dokter :" + formulir02.NoKTP);
        formulir01.Pembayaran();
        formulir01.Peraturan();

        System.out.println();
        FormulirStaff formulir03 = new FormulirStaff();
        formulir03.Nama = "Arkan";
        formulir03.Nohp = "085765424";
        formulir03.Alamat = "12 Januari 2003";
        formulir03.NoKTP = "87216465325";
        formulir03.NIK = "872556425";
        System.out.println("Nama dokter :" + formulir03.Nama);
        System.out.println("No hp dokter:" + formulir03.Nohp);
        System.out.println("Alamat dokter :" + formulir03.Alamat);
        System.out.println("NO ktp dokter :" + formulir03.NoKTP);
        System.out.println("NIK Dokter :" + formulir03.NIK);
        formulir01.Pembayaran();
        formulir01.Peraturan();
    }
}