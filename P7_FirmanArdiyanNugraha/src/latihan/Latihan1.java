package latihan;


import java.util.Scanner;

public class Latihan1 {

    public static void main(String [] args){

        int kehadiran, nilai, V;
        char Grade;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkin kehadiran: ");
        kehadiran = input.nextInt();

        System.out.print("masukkin nilai: ");
        nilai = input.nextInt();

        if (nilai >= 80){
            Grade = 'A';
        } else
        if (nilai >=70) {
            Grade = 'B';
        } else
        if (nilai >= 60){
            Grade = 'C';
        }else
        if (nilai >= 55){
            Grade = 'D';
        }else{
            Grade = 'E';
        }

        V = (21 * 75 + 99) /100;

        if(kehadiran >= V){
        }else{
            Grade = 'E';
        }

        System.out.println("nilai anda :" + nilai );
        System.out.println("gradenya   :" +  Grade);
    }
}