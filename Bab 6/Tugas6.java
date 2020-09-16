import java.util.Scanner;
public class Tugas6{
    static int volumeBalok(int p,int l,int t){
        int volum = p*l*t;
        return volum;
    }
    static int luasBalok(int p,int l,int t){
        int luas = 2*((p*l)+(p*t)+(l*t));
        return luas;
    }
    public static void Balok(){
        System.out.println("PROGRAM BALOK");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Balok();
        int p,l,t,luas,volume;
        System.out.print("Panjang : ");
        p = input.nextInt();
        System.out.print("Lebar : ");
        l = input.nextInt();
        System.out.print("Tinggi : ");
        t = input.nextInt();
        System.out.println();
        volume=volumeBalok(p,l,t);
        luas=luasBalok(p,l,t);
        System.out.println("Volume Balok = "+volume);
        System.out.println("Luas Permukaan Balok = "+luas);
    }
}