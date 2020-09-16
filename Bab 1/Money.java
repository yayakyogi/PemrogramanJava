import java.util.Scanner;
public class Money{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int nominal[]={100000,50000,20000,10000,5000,2000,1000,500,100};
        int uang;
        System.out.print("Masukkan Uang : ");
        uang = input.nextInt();
        for(int i=0; i<nominal.length; i++){
            int jml = uang/nominal[i];
            uang = uang - (nominal[i]*jml);
            if(jml==0){
                continue;
            }
            else{
                System.out.println("Pecahan "+nominal[i]+" Sebanyak : "+jml);
            }
        }
    }
}