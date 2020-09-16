import java.util.Scanner;
public class Kuadran{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x,y,kuadran;
        kuadran=0;

        System.out.print("Posisi X : ");
        x = input.nextInt();
        System.out.print("Posisi y : ");
        y = input.nextInt();
        
        if(x>0 && y>0){
            kuadran=1;
        }
        else if(x<0 && y>0){
            kuadran=2;
        }
        else if(x<0 && y<0){
            kuadran=3;
        }
        else if(x>0 && y<0){
            kuadran=4;
        }
        System.out.println("Titik ini berada pada kuadran : "+kuadran);
    }
}