/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasw7;

/**
 *
 * @author ingee
 */
public class Dog extends Animal {
    public void makeNoise () {
        System.out.println("bark");
        
    }
    Animal animal = new Animal () ;
        animal.makeNoise ();
        Dog dog = new Dog();
        dog.makeNoise () ;
        
        if (animal instanceof Animal)
        System.out.println("animal is Animal");
        if (dog instanceof Animal)
        System.out.println("dog is Animal");
        if (animal instanceof DOg)
        System.out.println("animal is Dog")
            
        }
    


