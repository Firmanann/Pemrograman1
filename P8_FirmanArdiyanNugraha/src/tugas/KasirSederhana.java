package tugas;

import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalBelanja = 0;
        int jumlahBarang = 0;
        int hargaBarang;
        String pilihan = "y";


        System.out.println("Kasih Sederhana");
        while (pilihan.equalsIgnoreCase("y")) {
            jumlahBarang++;

            System.out.println("Masukkan harga barang ke-" + jumlahBarang + " : ");
            hargaBarang = input.nextInt();
            totalBelanja = totalBelanja + hargaBarang;

            System.out.println("Mau tambah barang lagi? (y/n) : ");
            pilihan = input.next();
        }

        System.out.println("\n Struk anda : ");

        for (int a = 1; a <= jumlahBarang; a++) {
            System.out.println("Item ke-" + a + " masuk ke dalam tagihan.");
        }

        System.out.println("---------------------------------");
        System.out.println("Total item dibeli : " + jumlahBarang);
        System.out.println("Total yang harus dibayar : Rp" + totalBelanja);
    }
}