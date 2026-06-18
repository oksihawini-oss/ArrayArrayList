package bagian2.arrayList;


import java.util.ArrayList;

public class latihanMandiri4 {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        // Hapus item ke-2 (index 1)
        belanja.remove(1);

        System.out.println("Daftar Belanja:");
        for (String item : belanja) {
            System.out.println(item);
        }

        System.out.println("Jumlah item akhir: " + belanja.size());
    }
}
    

