import java.util.Scanner;
public class Nilai{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nilai;
        String huruf;

        System.out.print("Masukkan Nilai Angka : ");
        nilai = input.nextInt();
        if(nilai>90){
            huruf="A";
        }
        else if(nilai>80 && nilai<=90){
            huruf="B";
        }
        else{
            huruf="C";
        }
        System.out.println("Nilai huruf yang anda dapat : "+huruf);
    }
}