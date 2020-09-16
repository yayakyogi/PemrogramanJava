import java.util.Scanner;
public class Bab1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int panjang,lebar,luas;
        System.out.print("Panjang : ");
        panjang = input.nextInt();
        System.out.print("Lebar : ");
        lebar = input.nextInt();
        luas = panjang*lebar;
        System.out.println("");
        System.out.println("Panjang : "+luas);
    }
}