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
    public void construir(int id, String tipo) {
        atrEdificacion edif = new atrEdificacion();
        lista.add(id, tipo);
    }
    
}
