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
public class redDevils implements raza{
    razaL razas = raza.lista;
    @Override
    public void create() {
        razas.add(2);
    }
    
}
