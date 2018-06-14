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
public class Recurso2 implements edificacion{
    @Override
    public void construir(int id, String tipo, int money, int fase) {
        atrEdificacion edif = new atrEdificacion();
        int vida = returnVida(tipo);
        lista.add(id, tipo, vida, fase);
    }
    
    public int returnPrecio(String tipo){
        switch(tipo){
            case "Recolector Diamante":
                return 1100;
            case "Recolector Gemas":
                return 1100;
            case "Recoletcor Cacao":
                return 1100;
                
        }
        return 0;
    }
    
    public int returnVida(String tipo){
        switch(tipo){
            case "Recolector Diamante":
                return 110;
            case "Recolector Gemas":
                return 110;
            case "Recoletcor Cacao":
                return 110;
                
        }
        return 0;
    }
    
}
