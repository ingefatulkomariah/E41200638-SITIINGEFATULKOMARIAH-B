/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayb;

import java.util.Scanner;
/**
 *
 * @author ingee
 */
public class ArrayB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   System.out.println("Array B :");
   System.out.println();
   System.out.println("Masukan banyak angka random ");
   Scanner scan = new Scanner(System.in);
   
   int jumlah = scan.nextInt();
   int[] arl = new int[jumlah];
   for (int i = 0; i <arl.length; i++) {
   arl[i] = (int) (Math.random() * 100);
   System.out.print(arl[i] + " ");
   }
   System.out.println(); 
}
}

    
  
