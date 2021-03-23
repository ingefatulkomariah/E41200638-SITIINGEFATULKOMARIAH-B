/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author ingee
 */
class Latihan3 {
int price;
int pages;

    /**
     * @param args the command line arguments
     */
    public void set (int price, int page) {
        // TODO code application logic here
        this.price = price;
        this.pages = pages;
        
    }
    public void show () {
        System.out.println("books informations");
        System.out.println("books price : " +price);
        System.out.println("books of pages : " +pages);
    }
    
    public class buku {
    }
        public static void main(String[] args) {
            Latihan3 javabook = new Latihan3();
            
        javabook.set (6000, 100);
        javabook.show();
        
    }
}

