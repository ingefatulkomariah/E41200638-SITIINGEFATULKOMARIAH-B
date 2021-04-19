/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DESCENDING;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ingee
 */
public class DESCENDING {
    public static void main(String[] args)
    {
        int data, N = 0;
        int i, j, a, temp;
        Scanner input;
        input = new Scanner (System.in);
        System.out.print("input banyaknya jumlah data : ");
        try {
            N=input.nextInt();
        }
        catch(Exception e) {
            System.out.printf("data harus berupa angka!!!");
        }
        int angka[] = new int[N];
        int angka_desc[] = new int[N];
        
        for(i=0;i < N; i++) {
            System.out.print("masukkan data ke- "+ (i+1) + " : ");
            try {
                data = input.nextInt();
                angka[i] = data;
                angka_desc[i]=data;
            }
            catch (Exception e){
                System.out.println ("data harus berupa angka");
            }
        }
        for(i=0; i < N; i++){
            for(j=0; j < N; j++){
                if (angka_desc[1] < angka_desc[j]) {
                    temp = angka_desc[i];
                    angka_desc[i] = angka_desc[j];
                    angka_desc[j] = temp;
                }
            }
        }
        System.out.print("\n\ndata sebelum di urutkan : ");
        for(i=0; i< N; i++) {
            System.out.print(angka[i] + ", ");
        }
         System.out.print("\n\ndata setelah di urutkan descending: ");
        for(i=0; i< N; i++) {
            System.out.print(angka_desc[i] + ", ");
        }
        
        System.out.println(" ");
    }        
            }
        
