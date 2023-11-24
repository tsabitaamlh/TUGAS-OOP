public abstract class KonterHP {
    public String merk;
    public String warna;
    public String type;
    public String RAM;

    public void akomodasi() {
        System.out.println("Menyediakan akomodasi pada penjualan dan pelayanan");
    }

    public abstract void prosesPelayanan();
}