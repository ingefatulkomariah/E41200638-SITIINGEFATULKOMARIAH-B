/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanminggu3b;

/**
 *
 * @author ingee
 */
public class Latihanminggu3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] angka = {5,10,17,20,1};
        String[] teks = {"Saya","sedang","belajar","oop","java"};
        
         for(int i=0; i<angka.length; i++) {
            System.out.println(angka[i]);
            System.out.print(" ");
    }
        
        for(int j=0; j<teks.length; j++) {
            System.out.print(teks[j]);
            System.out.print(" ");
        }
    }
}
