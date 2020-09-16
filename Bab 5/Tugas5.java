public class Tugas5{
    public static void main(String[] args){
        // Tugas 1
        String[] huruf = {"A","B","C","D","E"};
        for(int i=0; i<huruf.length; i++){
            System.out.println("Karakter ke-"+i+" : "+huruf[i]);
        }
        System.out.println();
        // Tugas 2
        int[] angkaGenap = {2,4,6,8,10};
        for(int i=angkaGenap.length-1; i>=0; i--){
            System.out.println("Urutan ke-"+(i+1)+" : "+angkaGenap[i]);
        }
    }
}