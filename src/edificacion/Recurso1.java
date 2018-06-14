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
public class Recurso1 implements edificacion{
    @Override
    public void construir(int id, String tipo, int money, int fase) {
        atrEdificacion edif = new atrEdificacion();
        int vida = returnVida(tipo);
        lista.add(id, tipo, vida, fase);
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
    
}
