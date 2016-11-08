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
public class Main {
    public static void main(String[] args) {
        Sky sk = new Sky();
        
        System.out.println("Lpm");
        sk.agregarServicio(1, "Raul", TipoServicio.TV);
        System.out.println("alv");
        //sk.agregarServicio(1, "Raul", TipoServicio.INTERNET);
        
        //sk.agregarCanalAServicioTV(1, "Playboy");
        //sk.agregarCanalAServicioTV(1, "VenusTV");
        //sk.agregarCanalAServicioTV(1,"Playboy");
        
        sk.cobrar(1);
    }
}
