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
public abstract class Servicio {
    protected String nombre;
    protected int codigo;
    
    public Servicio(String name, int codigo){
        nombre=name;
        this.codigo =codigo;
    }
    
    public final String getNombre(){
        return nombre;
    }
    
    public final int getCodigo(){
        return codigo;
    }
    
    public abstract double  getMontoMensual();
    
    @Override
    public String toString() {
        return "Servicio{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
}
