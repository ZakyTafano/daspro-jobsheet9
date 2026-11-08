import java.util.Arrays;

public class ArrayBilangan25 {
    public static void main(String[] args) {
        // Langkah 2 & 3: Deklarasi dan inisialisasi array
        int[] bil = {5, 13, -7, 17};

        // Langkah 4: Menampilkan elemen menggunakan perulangan for
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // Langkah 5: Pengayaan menggunakan foreach loop dan Arrays.toString()
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}