import java.io.File; //mengimpor kelas File dari pustaka Java I/O. Kelas 
import java.io.IOException; //pengecualian yang dilemparkan ketika terjadi kesalahan
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {
    private String namaFileDataMahasiswa = "data_mahasiswa.txt";

    public void simpanKeFile(ArrayList<Mahasiswa> daftarMahasiswa) {
        try (PrintWriter writer = new PrintWriter(new File(namaFileDataMahasiswa))) {
            for (Mahasiswa m : daftarMahasiswa) {
                writer.println(m.getNim() + "," + m.getNama() + "," + m.getKelas() + "," + m.getAsal());
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file" + e.getMessage());
        }
    }

    public ArrayList<Mahasiswa> bacaDariFile() {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>(); // sebuah baris yang menyimpan daftar mahasiswa
        try (Scanner scanner = new Scanner(new File(namaFileDataMahasiswa))) { // membuka file dengan nama yang disimpan
                                                                               // dalam variabel namaFileDataMahasiswa
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) { // buat masukin ke database, jika ada 2 maka yang dimasukin ada 2 saja
                    Mahasiswa m = new Mahasiswa(parts[0], parts[1], parts[2], parts[3]);
                    daftarMahasiswa.add(m);
                }
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file" + e.getMessage());
        }
        return daftarMahasiswa;
    }
}