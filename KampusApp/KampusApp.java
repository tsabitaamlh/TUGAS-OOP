import java.util.ArrayList;
import java.util.Scanner;

public class KampusApp {
    private Scanner scanner;
    private Database database;

    public static void main(String[] args) {
        KampusApp kampusApp = new KampusApp();
        kampusApp.showMenu();
    }

    public KampusApp() {
        scanner = new Scanner(System.in);
        database = new Database();
    }

    public void showMenu() {
        System.out.println("\n-- Selamat Datang di Aplikasi Kampus --");
        System.out.println("Pilihan Menu:");
        System.out.println("1 -> Tambah Data Mahasiswa");
        System.out.println("2 -> Ubah Data Mahasiswa");
        System.out.println("3 -> Hapus Data Mahasiswa");
        System.out.println("4 -> Cari Data Mahasiswa");
        System.out.println("5 -> Tampikan Semua Data Mahasiswa");
        System.out.println("0 -> Keluar Aplikasi");
        System.out.print("Silahkan masukkan menu yang dipilih: ");
        int menuYangDipilih = scanner.nextInt();
        scanner.nextLine();

        switch (menuYangDipilih) {
            case 1:
                menuTambah();
                break;
            case 2:
                menuUbah();
                break;
            case 3:
                menuHapus();
                break;
            case 4:
                menuCari();
                break;
            case 5:
                menuTampilkanSemua();
                break;
            case 0:
                System.out.println("* Terima kasih sudah menggunakan Aplikasi Kampus *");
                System.exit(0);
                break;
            default:
                System.out.println("Menu tidak valid. Silahkan coba lagi.");
        }
        scanner.close();
    }

    public void menuTambah() {
        System.out.println("----- Menu Tambah Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan Asal: ");
        String asal = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, kelas, asal);
        database.create(mahasiswa);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuUbah() {
        System.out.println("----- Menu Ubah Data Mahasiswa -----");
        System.out.print("Masukkan NIM Sebelumnya: ");
        String nimLama = scanner.nextLine();
        System.out.print("Masukkan NIM Baru: ");
        String nimBaru = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        System.out.println("Masukkan Asal: ");
        String asal = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nimBaru, nama, kelas, asal);
        database.update(mahasiswa, nimLama);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuCari() {
        System.out.println("----- Menu Cari Data Mahasiswa -----");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        Mahasiswa mahasiswa = database.read(nama);
        if (mahasiswa == null) {
            System.out.println("* Nama tidak ditemukan *");
        } else {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *");
            System.out.println("* Nama: " + mahasiswa.getNama() + " *");
            System.out.println("* Kelas: " + mahasiswa.getKelas() + " *");
            System.out.println("* Asal: " + mahasiswa.getAsal() + " *");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuHapus() {
        System.out.println("----- Menu Hapus Data Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        database.delete(nim);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuTampilkanSemua() {
        System.out.println("----- Data Seluruh Mahasiswa -----");
        ArrayList<Mahasiswa> allMahasiswa = database.read();
        for (Mahasiswa mahasiswa : allMahasiswa) {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *");
            System.out.println("* Nama: " + mahasiswa.getNama() + " *");
            System.out.println("* Kelas: " + mahasiswa.getKelas() + " *");
            System.out.println("* Asal: " + mahasiswa.getAsal() + " *");
            System.out.println("---------------------------------");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }
}