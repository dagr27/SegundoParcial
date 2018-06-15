/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificacion;

import centroMando.atrCentro;
import centroMando.recursos;

/**
 *
 * @author Daniel Gómez
 */
public class Recurso1 implements edificacion{
    @Override
    public void construir(int id, String tipo, int money, int fase) {
        atrEdificacion edif = new atrEdificacion();
        int vida = returnVida(tipo);
        if(money >= returnPrecio(tipo)){
            lista.add(id, tipo, vida, fase);
            centroL.CobrarRec1(id, returnPrecio(tipo));
        }else{
            System.out.println("El money no le ajusta");
        }
    }
    
    public int returnPrecio(String tipo){
        switch(tipo){
            case "Recolector Oro":
                return 1000;
            case "Recolector Perlas":
                return 1000;
            case "Recoletcor Metal":
                return 1000;
                
        }
        return 0;
    }
    
    public int returnVida(String tipo){
        switch(tipo){
            case "Recolector Oro":
                return 100;
            case "Recolector Perlas":
                return 100;
            case "Recoletcor Metal":
                return 100;
                
        }
        return 0;
    }

    @Override
    public void recolectar(int id, String tipo, int fase) {
        if(fase!=5){
            int total = lista.recolectarRec1(id);
            centroL.AbonarR1(id, total);
            System.out.println("Se abonaron del Recurso 1: "+total);
        }
        
    }
    
}
