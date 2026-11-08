import java.util.Scanner;

public class Tugas125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMhs];
        int total = 0;

        // 2. Memasukkan setiap nilai mahasiswa satu per satu
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            total += nilaiMahasiswa[i]; // Akumulasi total nilai
        }

        // 3. Menghitung nilai rata-rata
        double rataRata = (double) total / jumlahMhs;

        // 4. Mencari nilai tertinggi dan nilai terendah
        int tertinggi = nilaiMahasiswa[0];
        int terendah = nilaiMahasiswa[0];

        for (int i = 1; i < jumlahMhs; i++) {
            if (nilaiMahasiswa[i] > tertinggi) {
                tertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < terendah) {
                terendah = nilaiMahasiswa[i];
            }
        }

        // Menampilkan ringkasan hasil
        System.out.println("\n--- RINGKASAN NILAI MAHASISWA ---");
        System.out.println("Total nilai keseluruhan : " + total);
        System.out.println("Nilai rata-rata kelas   : " + rataRata);
        System.out.println("Nilai tertinggi         : " + tertinggi);
        System.out.println("Nilai terendah          : " + terendah);

        // 5. Menampilkan semua nilai beserta status kelulusannya
        System.out.println("\n--- DAFTAR STATUS KELULUSAN ---");
        for (int i = 0; i < jumlahMhs; i++) {
            String status = (nilaiMahasiswa[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i] + " (" + status + ")");
        }
    }
}
