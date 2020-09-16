import java.util.Scanner;
public class Toko{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka1,angka2,angka3,max;
        max=0;
        System.out.print("Bilangan Pertama : ");
        angka1 = input.nextInt();
        System.out.print("Bilangan kedua : ");
        angka2 = input.nextInt();
        System.out.print("Bilangan ketiga : ");
        angka3 = input.nextInt();
        if(angka1>angka2 && angka1>angka3){
            max=angka1;
        }
        else if(angka2>angka1 && angka2>angka3){
            max=angka2;
        }
        else if(angka3>angka1 && angka3>angka2){
            max=angka3;
        }
        System.out.println("Bilangan terbesar adalah : "+max);
    }
}