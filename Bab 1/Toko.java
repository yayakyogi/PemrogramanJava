import java.util.Scanner;

public class Toko{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Deklarasi variabel
        double jmlBuku,jmlBolpoint,jmlPenghapus;
        double totalBuku,totalBolpoint,totalPenghapus;
        double labaBuku,labaBolpoint,labaPenghapus;
        double totalPenjualan,totalLaba;
        // Input
        System.out.print("Jumlah Penjualan Buku : ");
        jmlBuku = input.nextDouble();
        System.out.print("Jumlah Penjualan Bolpoint : ");
        jmlBolpoint = input.nextDouble();
        System.out.print("Jumlah Penjualan Penghapus : ");
        jmlPenghapus = input.nextDouble();
        // Proses hitung total penjualan
        System.out.println("PEMASUKAN");
        totalBuku = jmlBuku*5000;
        totalBolpoint = jmlBolpoint*3000;
        totalPenghapus = jmlPenghapus*2000;
        totalPenjualan = totalBuku+totalBolpoint+totalPenghapus;
        System.out.println("Penjualan Buku Tulis : "+totalBuku);
        System.out.println("Penjualan Bolpoint : "+totalBolpoint);
        System.out.println("Penjualan Penghapus : "+totalPenghapus);
        System.out.println("Jumlah Total Penjualan : "+totalPenjualan);
        // Proses hitung total laba
        System.out.println("KEUNTUNGAN");
        labaBuku = jmlBuku*800;
        labaBolpoint = jmlBolpoint*500;
        labaPenghapus = jmlPenghapus*300;
        totalLaba = labaBuku+labaBolpoint+labaPenghapus;
        System.out.println("Penjualan Buku Tulis : "+labaBuku);
        System.out.println("Penjualan Bolpoint : "+labaBolpoint);
        System.out.println("Penjualan Penghapus : "+labaPenghapus);
        System.out.println("Jumlah Total Penjualan : "+totalLaba);
    }
}