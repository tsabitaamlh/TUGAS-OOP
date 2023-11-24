public class MainKonter {
    public static void main(String[] args) {
        Pelayanan hp1 = new Pelayanan();
        System.out.println();
        hp1.merk = "Apple";
        hp1.warna = "Pink";
        hp1.type = "iPhone 13";
        hp1.RAM = "256 GB";
        hp1.jenisLayanan = "IOS";
        System.out.println("Merk HP:" + hp1.merk);
        System.out.println("Warna HP " + hp1.warna);
        System.out.println("Type HP " + hp1.type);
        System.out.println("RAM " + hp1.RAM);
        System.out.println("Jenis Layanan" + hp1.jenisLayanan);
        hp1.akomodasi();
        hp1.prosesPelayanan();

        System.out.println();
        Penjualan hp2 = new Penjualan();
        System.out.println("Penjualan :");
        hp2.merk = "Apple";
        hp2.warna = "Pink";
        hp2.type = "iPhone 13";
        hp2.RAM = "256 GB";
        hp2.harga = "13000000";
        hp2.jumlahStok = "100";
        System.out.println("Merk HP:" + hp2.merk);
        System.out.println("Warna HP " + hp2.warna);
        System.out.println("Type HP " + hp2.type);
        System.out.println("Harga HP " + hp2.harga);
        System.out.println("Jumlah Stok HP " + hp2.jumlahStok);
        hp2.akomodasi();
        hp2.prosesPelayanan();

        System.out.println();
        Member hp3 = new Member();
        hp3.merk = "Apple";
        hp3.warna = "Pink";
        hp3.type = "iPhone 13";
        hp3.RAM = "256 GB";
        hp3.nama = "Bita";
        hp3.noHP = "083775367";
        hp3.email = "tsabita@gmail.com";
        System.out.println("Merk HP:" + hp1.merk);
        System.out.println("Warna HP " + hp1.warna);
        System.out.println("Type HP " + hp1.type);
        System.out.println("RAM " + hp1.RAM);
        System.out.println("Nama " + hp3.nama);
        System.out.println("No Handphone " + hp3.noHP);
        System.out.println("Alamat Email " + hp3.email);
        hp2.akomodasi();
        hp2.prosesPelayanan();

    }
}