/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.ArrayList;

/**
 *
 * @author AdolfAlcantara
 */
public class TvService extends Servicio{
    
    protected ArrayList<String> canales;
    protected boolean isDigital;
    
    public TvService(String n,int c,boolean t){
        super(n,c);
        isDigital=t;
        canales=new ArrayList<>();
    }

    public boolean agregarCanal(String canal){
        for(String c:canales){
            if(c.equalsIgnoreCase(canal))
                return false;
        }
        canales.add(canal);
        return true;
    }
    
    
    
    @Override
    public double getMontoMensual(){
        int contador=0;
        for(String s:canales){
            contador+=1;
        }
        if(isDigital){
            return contador*8;
        }else{
            return contador*5;
        }
    }
    
    @Override
    public String toString() {
        return super.toString()+"Digital:"+isDigital;
    }
    
    
}
