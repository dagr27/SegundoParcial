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
public class fabricaVehiculo implements edificacion {

    @Override
    public void construir(int id, String tipo, int money, int fase) {
        atrEdificacion edif = new atrEdificacion();
        int vida = 90;
        if(money >= 400){
            lista.add(id, tipo, vida, fase);
            centroL.CobrarRec2(id, 400);
        }else{
            System.out.println("El money no le ajusta");
        }
    }

    @Override
    public void recolectar(int id, String tipo, int fase) {
        
    }
    
}
