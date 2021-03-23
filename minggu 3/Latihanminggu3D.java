/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanminggu3d;

/**
 *
 * @author ingee
 */
import java.util.Scanner;

public class Latihanminggu3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        System.out.print("inputkan nilai: ");
        nilai = scan.nextInt();
        
        if (nilai >=90) {
            grade ="A";
        }
           if (nilai >=80) {
            grade ="B+";
           }
             if (nilai >=70) {
            grade ="B";}
             if (nilai >=60) {
            grade ="C+"; }
             if (nilai >=50) {
            grade ="C"; }
             if (nilai >=40) {
            grade ="D";
             }
             else { grade = "E"; }
             
             System.out.println("Grade: " + grade);
             }
             }
             
          
    
    
           
