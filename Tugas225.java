import java.util.Scanner;

public class Tugas225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cariMenu = sc.nextLine();
        boolean ditemukan = false;
        int indeksMenu = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                indeksMenu = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("-> Menu \"" + menu[indeksMenu] + "\" tersedia dengan harga Rp " + harga[indeksMenu] + "\n");
        } else {
            System.out.println("-> Mohon maaf, menu \"" + cariMenu + "\" tidak tersedia di kafe.\n");
        }

        System.out.print("Masukkan jumlah jenis item yang ingin dipesan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananJumlah = new int[jumlahPesanan];
        int[] pesananSubtotal = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            String namaPesanan = "";
            boolean menuValid = false;

            while (!menuValid) {
                System.out.print("Masukkan nama menu yang dipesan: ");
                namaPesanan = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        menuValid = true;
                        namaPesanan = menu[j]; 
                        break;
                    }
                }

                if (!menuValid) {
                    System.out.println("Menu tidak valid atau tidak tersedia. Silakan masukkan ulang nama menu dengan benar!");
                }
            }

            System.out.print("Masukkan jumlah porsi/item untuk " + namaPesanan + ": ");
            int qty = sc.nextInt();
            sc.nextLine(); 

            int hargaSatuan = 0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(namaPesanan)) {
                    hargaSatuan = harga[j];
                    break;
                }
            }

            int subtotal = hargaSatuan * qty;

            pesananNama[i] = namaPesanan;
            pesananJumlah[i] = qty;
            pesananSubtotal[i] = subtotal;

            totalBiaya += subtotal;
        }

        System.out.println("\n========================================");
        System.out.println("         STRUK PEMESANAN KAFE KAMPUS    ");
        System.out.println("========================================");
        System.out.printf("%-20s | %-5s | %-10s\n", "Menu", "Qty", "Subtotal");
        System.out.println("----------------------------------------");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-20s | %-5d | Rp %-7d\n", pesananNama[i], pesananJumlah[i], pesananSubtotal[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL BIAYA KESELURUHAN : Rp " + totalBiaya);
        System.out.println("========================================");
        System.out.println("Terima kasih telah memesan di Kafe Kampus!");

        sc.close();
    }
}
