/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AdolfAlcantara
 */
public class Sky {
    Scanner lea = new Scanner(System.in);
    protected ArrayList<Servicio> servicios;
    
    public Sky(){
        servicios=new ArrayList<>();
    }
    
    public void agregarServicio(int codigo, String nombre, TipoServicio tipo){
        for(Servicio s:servicios){
            if(s.codigo==codigo){
                System.out.println("Codigo ya existe");
            }
        }
        if(tipo == TipoServicio.INTERNET){
            servicios.add(new InternetService(nombre,codigo,AnchoBanda.valueOf(lea.next())));
            System.out.println("Se agrego servicio de Internet");
        }
        else{
            servicios.add(new TvService(nombre,codigo,lea.nextBoolean()));
            System.out.println("Se agrego servicio de TV");
        }
    }
    
    public void agregarCanalAServicioTV(int codigo,String canal){
        for(Servicio s: servicios){
            if(s.codigo==codigo){
                if(s instanceof TvService){
                    ((TvService) s).agregarCanal(canal);
                    System.out.println("Se agrego con exito el canal");
                }
            }
        }
        System.out.println("No se agrego el canal");
    }
    
    public void cobrar(int c){
        for(Servicio s:servicios){
            if(s.codigo==c){
                System.out.println("Monto a pagar: "+s.getMontoMensual());
            }
        }
    }
}
