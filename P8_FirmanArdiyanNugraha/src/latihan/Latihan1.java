package latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Program Looping");

        // for loop
        System.out.print("Berapa angka yang ingin kamu cetak? ");
        int batasAngka = input.nextInt();

        for(int i = 1; i <= batasAngka; i++){
            System.out.print("Nilai ke-" + i + "\n");
        }
    }
}
