import java.util.Scanner;
public class Tugas7_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka,penjumlahan,perkalian;
        System.out.print("Masukkan Angka : ");
        angka = input.nextInt();
        for(int i=angka-1; i>=0; i--){
            System.out.print((i+1)+"+");
            if(i==0){
                penjumlahan=Penjumlahan(angka);
                System.out.println("="+penjumlahan);
            }
        }
        for(int i=angka-1; i>=0; i--){
            System.out.print((i+1)+"+");
            if(i==0){
                perkalian=Perkalian(angka);
                System.out.println("="+perkalian);
            }
        }
    }
    // Penjumlahan
    public static int Penjumlahan(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return Penjumlahan(n-1)+n;
        }
    }
    // Perkalian
    public static int Perkalian(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return Perkalian(n-1)*n;
        }
    }
}