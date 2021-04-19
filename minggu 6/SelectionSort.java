/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;
import java.util.Scanner;

/**
 *
 * @author ingee
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        //inppput jumalah data
        System.out.print("masukkan jumlah data : "); int jlh_data = scan.nextInt();
        
//input nilai tiap data
        int[] data = new int[jlh_data]; // array untuk nilai tiap data
        System.out.println();
         for(int x = 0; x < jlh_data; x++)
        {
            System.out.print("input nilai data ke-"+(x+1)+" : ");
            data[x] = scan.nextInt();
            
        }
        //tampilkan data sebelum di sorting
        System.out.println();
        System.out.print("data sebelum di sorting : ");
        for(int x = 0; x < jlh_data; x++)
            System.out.print(data[x]+" ");
        
        //proses selection sort
        System.out.println("\n\nProses selection sort");
        for (int x=0; x < jlh_data-1; x++)
        {
            System.out.println("Iterasi ke-"+(x+1)+" : ");
           for (int y=0; y < jlh_data; y++)
               System.out.print(data[y]+ " ");
           
           System.out.println("apakah data "+data[x]+" sudah benar urutannya?");
           
           boolean tukar = false;
           int index = 0;
           int min = data[x];
           String pesan = "tidak ada pertukaran";
           for (int y= x+1; y < jlh_data; y++)
           {
               if(min > data[y])
               {
                   tukar = true;
                           index = y;
                          min = data[y];
                          
               }       
           }
                   
               if(tukar == true)
               {
                   // pertukaran data
                   pesan = "data "+data[x]+" di tukar dengan data "+data[index];
                   int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
               }
               for(int y=0; y < jlh_data; y++)
                   System.out.print(data[y]+" "); 
               
               System.out.println(pesan+"\n");
        }
        //tampilkan setelah di sorting
        System.out.print("data setelah di sorting : ");
        for(int x = 0; x < jlh_data; x++)
        System.out.print(data[x]+" ");
        
        }
        
    }
    

