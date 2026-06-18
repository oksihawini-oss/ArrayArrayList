package bagian4.tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public void tampilkanSemua() {
        System.out.println("=== Data Mahasiswa ===");

        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "Lulus" : "Tidak Lulus";

            System.out.println(
                    "Nama  : " + m.getNama()
                    + " | NPM : " + m.getNpm()
                    + " | Nilai : " + m.getNilai()
                    + " | Status : " + status);
        }
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
    


