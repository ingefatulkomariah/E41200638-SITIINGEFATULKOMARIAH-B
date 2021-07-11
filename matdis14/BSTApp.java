/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matdis14;

/**
 *
 * @author ingee
 */
public class BSTApp {
    public static void main(String[] args){
        Node x1= new Node(40);
        Node x2= new Node(32);
        Node x3= new Node(12);
        Node x4= new Node(24);
        Node x5= new Node(4);
        Node x6= new Node(38);
        Node x7= new Node(36);
        
        x1.kiri = x2;
        x1.kanan = x5;
        x2.kiri = x3;
        x2.kanan = x4;
        x5.kiri = x6;
        x5.kanan = x7;
                
        BST bst = new BST(x1);
        
        System.out.println("Nama : Siti ingefatul komariah");
        System.out.println("NIM  : E41200638");
        System.out.println("GOL  : B");
        System.out.println("--------------------------------");
        bst.preOrder(bst.root);
        System.out.println(" = PreOrder" );
        bst.inOrder(bst.root);
        System.out.println(" = InOrder " );
        bst.postOrder(bst.root);
        System.out.println(" = PostOrder");
    }  
}
