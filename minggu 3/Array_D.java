/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_d;

import java.util.Scanner;

/**
 *
 * @author ingee
 */
public class Array_D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int harga1, harga2, harga3, harga4, harga5, total = 0;
        String nama;
        
        System.out.println("===================================");
        System.out.println("Kharisma Agung Plaza (KAP)");
        System.out.println("Promo Belanja Berhadiah");
        System.out.println("Khusus Pembelian 5 Barang Pertama");
        System.out.println("Dengan Harga Minim Rp 10000");
        System.out.println("===================================");
        System.out.println();
        
        System.out.println("===================================");
        System.out.println("Masukkan nama Pembeli : ");
        nama = input.nextLine();
        
        System.out.println("Masukkan harga Barang ke-1 : Rp ");
        harga1 = input.nextInt();
        System.out.println("Masukkan harga Barang ke-2 : Rp ");
        harga2 = input.nextInt();
        System.out.println("Masukkan harga Barang ke-3 : Rp ");
        harga3 = input.nextInt();
        System.out.println("Masukkan harga Barang ke-4 : Rp ");
        harga4 = input.nextInt();
        System.out.println("Masukkan harga Barang ke-5 : Rp ");
        harga5 = input.nextInt();
        {
        
        total = harga1 + harga2 +harga3 + harga4 + harga5;
        System.out.println("Total Harga Pembelian Atas Nama " + nama + " Adalah Rp" + total);
        System.out.println("Selamat . . . . .");
        System.out.println("Anda Mendapatkan Hadiah 1 Buah Mug cantik ");
        System.out.println("==================================");
        
        System.out.println("Terimaksih");
        System.out.println("Anda Sudah Belanja di Agung Plaza");

}   
}
}