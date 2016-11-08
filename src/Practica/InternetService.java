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
public class InternetService extends Servicio{
    
    protected AnchoBanda ancho;
    
    public InternetService(String n,int c,AnchoBanda tipo){
        super(n,c);
        ancho=tipo;
    }

    @Override
    public double getMontoMensual() {
        return ancho.getPrice();
    }
    
    @Override
    public String toString(){
        return super.toString()+"ancho de banda: "+ancho;
    }
    
}
