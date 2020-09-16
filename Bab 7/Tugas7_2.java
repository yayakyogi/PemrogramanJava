import java.util.Scanner;
public class Tugas7_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char kondisi;
        int n,hasil;
        do{
            System.out.print("Masukkan nilai n : ");
            n = input.nextInt();
            for(int i=0; i<n; i++){
                hasil = Fibonanci(i);
                System.out.print(hasil+" ");
            }
            System.out.println();
            System.out.print("Ulangi lagi (y/n) : ");
            kondisi = input.next().charAt(0);
            System.out.println();
        }while(kondisi=="y");
    }
    public static int Fibonanci(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return Fibonanci(n-1)+Fibonanci(n-2);
        }
    }
}