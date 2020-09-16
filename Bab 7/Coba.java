import java.util.Scanner;
public class Coba{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama;
        do{
        System.out.print("Nama : ");
        nama = input.nextLine();
        }
        while(nama=="y");
    }
}