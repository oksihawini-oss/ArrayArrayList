package bagian1.array;

public class latihanMandiri1 {
    public static void main(String[] args) {
        double[] suhu = {10, 20, 30, 40, 50, 60};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }

            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }

        System.out.println("Suhu tertinggi = " + tertinggi);
        System.out.println("Suhu terendah = " + terendah);
    }
}
    
