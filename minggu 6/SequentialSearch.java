/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

/**
 *
 * @author ingee
 */
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] exampleVariableOne = {2,9,6,7,4,5,3,0,1};
        int target = 4;
        SequentialSearch(exampleVariableOne, target);
    }
    
    private static void SequentialSearch(int[] parameterOne, int parameterTwo) {
        int index = -1;
        
        for (int i = 0; i < parameterOne.length; i++) {
            if (parameterOne[i] == parameterTwo) {
                
                index = i;
                break;
                
            }
        }
     if (index == -1) {
         System.out.println("your target integer does not exist in the array");
     } else {
         System.out.println("your target integer is in index" + index + " of the array");
         
    
     }
    }
    
}
