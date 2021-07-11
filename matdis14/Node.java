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
public class Node {
    
    int key;
    Node kiri;
    Node kanan;
    
    public Node (int key){
        this.key = key;
        kiri = null;
        kanan = null;
    }
    
}
