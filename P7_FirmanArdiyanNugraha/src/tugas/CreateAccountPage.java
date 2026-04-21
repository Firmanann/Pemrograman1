package tugas;

import java.util.Scanner;

public class CreateAccountPage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "";
        String password = "";
        String usernameInput;
        String passwordInput;
        int pilihan;
        
        do {

            System.out.println("Masukkan Pilihan : ");
            System.out.println("1. Buat Akun ");
            System.out.println("2. Masuk ");
            System.out.println("3. Keluar ");

            pilihan = input.nextInt();
            input.nextLine(); //membersihkan sisa enter

            switch (pilihan) {
                case 1 :
                    System.out.println("Buat Akun");
                    System.out.println("Masukkan username : ");
                    username = input.nextLine();

                    System.out.println("Masukkan password : ");
                    password = input.nextLine();
                    break;

                case 2 :
                    System.out.println("Masuk");
                    System.out.println("Masukkan username : ");
                    usernameInput = input.nextLine();

                    System.out.println("Masukkan password : ");
                    passwordInput = input.nextLine();

                    if (username.equals(usernameInput) && password.equals(passwordInput)) {
                        System.out.println("Anda berhasil masuk");
                    } else {
                        System.out.println("Anda Ditolak masuk");
                    }
                    break;

                case 3 :
                    System.out.println("Program keluar");
                    break;

                default:
                    System.out.println("Input Salah");
            }
        } while (pilihan != 3);

    }
}
