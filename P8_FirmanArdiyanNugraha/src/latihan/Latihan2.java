package latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;
        int jumlahKehadiran;


        int v = 21 * 75 / 100;

        System.out.println("Masukkan Pilihan : ");
        System.out.println("1.Masukkan Kehadiran  ");
        System.out.println("2.Keluar ");
        pilihan = input.nextInt();

        if (pilihan == 1){
            System.out.println("Masukkan Jumlah Kehadiran :");
            jumlahKehadiran = input.nextInt();

            while (jumlahKehadiran < v){
                System.out.println("Kehadiran kamu dibawah 75%");
                System.out.println("Masukkan Jumlah Kehadiran :");
                jumlahKehadiran = input.nextInt();
            }

            for (int a = 1; a <= jumlahKehadiran; a++){
                System.out.println("Kehadiran ke-" + a + " Hadir");
            }

        }  else {
            System.out.println("Selesai");
        }
    }
}