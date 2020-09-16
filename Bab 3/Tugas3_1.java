import java.util.Scanner;
public class Tugas3_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i,j,n;
        System.out.print("Masukkan nilai N : ");
        n = input.nextInt();
        for(i=0; i<=n; i++){
            for(j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}