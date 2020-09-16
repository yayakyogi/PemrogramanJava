import java.util.Scanner;

public class Segitiga{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double alas,tinggi,luas;

        System.out.print("Masukkan Alas : ");
        alas = input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        tinggi = input.nextInt();
        luas = alas*tinggi*0.5;
        System.out.println("Luas = "+luas+" cm");
    }
}