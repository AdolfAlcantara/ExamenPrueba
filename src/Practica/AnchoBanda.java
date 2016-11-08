/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

/**
 *
 * @author AdolfAlcantara
 */
public enum AnchoBanda {
    V256(15),V512(25),V1(35),V2(45),V5(55);
    
    private final double price;
    private AnchoBanda(int p){
        price=p;
    }
    
    public final double getPrice(){
        return price;
    }
}
