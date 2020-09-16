import java.util.Scanner;
public class Tugas3_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i,j,k,n;
        System.out.print("Masukkan nilai A : ");
        n = input.nextInt();
        for(i=1; i<=n; i++){
            for(j=1; j<i; j++){
                System.out.print(" ");
            }
            for(k=n; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}