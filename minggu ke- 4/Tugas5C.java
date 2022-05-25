/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5c;
import java.util.Scanner;

/**
 *
 * @author ingee
 */
public class Tugas5C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data nilai = ");
        int size = scan.nextInt();
        int [] array = new int[size];
        for(int k =0; k<size;k++){
            int m = k+1;
            System.out.print("Maukkan data nilai ke-"+m+" = " );
            array[k]=scan.nextInt();
        }
        scan.close();
       
        
        int LargeArray[];
        LargeArray = array;
        float totalArray = 0;
        int smallest = LargeArray[0];
        int largest = LargeArray[0];
        
        for(int i =0 ; i<=3; i++){
            if (LargeArray[i] < smallest) smallest = LargeArray[i];
            if (LargeArray[i] > largest ) largest = LargeArray[i];   
            }
        for(int j =0 ;j < LargeArray.length; j++){
            totalArray =  totalArray + LargeArray[j];
            
        }
        
        float rata2;
        rata2 = totalArray / LargeArray.length;
            
            
            
            System.out.println("Nilai minimum  = " +smallest);
            System.out.println("Nilai maksimum = " +largest);
            System.out.println("Nilai rata ratanya adalah = "+rata2);
    }}
    
    

