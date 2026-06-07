package bagian1.array;

public class latihanMandiri2 {
    public static void main(String[] args) {
        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Minggu"
        };

        System.out.println("Hari dengan lebih dari 5 huruf:");

        for (int i = 0; i < hari.length; i++) {
            if (hari[i].length() > 5) {
                System.out.println(hari[i]);
            }
        }
    }
}
