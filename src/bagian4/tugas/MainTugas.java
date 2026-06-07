package bagian4.tugas;

// Nama : Oksi
// NPM  : Isi dengan NPM Anda

public class MainTugas {

    public static void main(String[] args) {

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("=== Daftar Mata Kuliah ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "231001", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "231002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "231003", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "231004", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "231005", 40));

        System.out.println();
        kelas.tampilkanSemua();

        System.out.println("\nRata-rata Nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah Mahasiswa Lulus : "
                + kelas.jumlahLulus());

        // Menambah mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "231006", 88));

        System.out.println("\nMahasiswa baru berhasil ditambahkan.");

        System.out.println("Jumlah Mahasiswa Terbaru : "
                + kelas.jumlahMahasiswa());
    }
}
    

