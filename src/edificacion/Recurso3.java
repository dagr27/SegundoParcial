/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificacion;

/**
 *
 * @author Daniel Gómez
 */
public class Recurso3 implements edificacion {
    @Override
    public void construir(int id, String tipo, int money, int fase) {
        atrEdificacion edif = new atrEdificacion();
        if(money >= returnPrecio(tipo)){    
            int vida = returnVida(tipo);
            lista.add(id, tipo, vida, fase);
            centroL.CobrarRec1(id, returnPrecio(tipo));
        }else{
            System.out.println("El money no le ajusta");
        }
    }
    
    public int returnPrecio(String tipo){
        switch(tipo){
            case "Recolector Bismuto":
                return 1200;
            case "Recolector Plastilina":
                return 1200;
            case "Recoletcor Metal":
                return 1200;
                
        }
        return 0;
    }
    
    public int returnVida(String tipo){
        switch(tipo){
            case "Recolector Bismuto":
                return 120;
            case "Recolector Plastilina":
                return 120;
            case "Recoletcor Metal":
                return 120;
                
        }
        return 0;
    }

    @Override
    public void recolectar(int id, String tipo, int fase) {
        if(fase!=5){
            int total = lista.recolectarRec3(id);
            centroL.AbonarR3(id, total);
            System.out.println("Se abonaron del Recurso 3: "+total);
        }
    }
    
}
