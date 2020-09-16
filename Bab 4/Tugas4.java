import java.util.Scanner;
public class Tugas4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bilprima;
        int x,y,n,faktor,maks; 
        x=1; n=1;
        System.out.print("Masukkan Jumlah Maks Bilangan : ");
        bilprima = input.nextInt();
        while(n<=bilprima){
            faktor=0;
            for(y=x; y>=1; y--){
                // jika x bisa dibagi y maka y adalah faktor dari x
                if(x%y==0){
                    faktor++;
                }
            }
            // jika faktornya 2 maka x bilangan prima
            if(faktor==2){
                System.out.print(x+", ");
                n++;
            }
            x++;
        }
        System.out.println();
    }
}