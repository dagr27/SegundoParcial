/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raza;

/**
 *
 * @author Daniel Gómez
 */
public class kops implements raza {
    atrRaza kops = new atrRaza();
    @Override
    public void create() {
        kops.setId(1);
        kops.setNombre("Kops");
        kops.setDescripcion("Una raza muy temida por el resto de la gente");
        kops.setFortaleza("Fuerza");
    }
    
}
