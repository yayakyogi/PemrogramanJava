import java.util.Scanner;
public class Tugas3_3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,j,n;
        System.out.print("Ukuran Box : ");
        n = input.nextInt();
        for(i=1; i<=n; i++){
            for(j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}