/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5b;

/**
 *
 * @author ingee
 */
public class Tugas5B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("        Do_while");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int i = 1;
        do {
            System.out.print(i*2 + " ");
            i++;
        } 
        while ( i < 100);
    }
}
   
