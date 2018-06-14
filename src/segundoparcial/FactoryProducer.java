/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import centroMando.centroMandoFactory;
import edificacion.edificacionFactory;
import jugador.jugadorFactory;

/**
 *
 * @author Daniel Gómez
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String fac){
        switch(fac){
            case "jugador":
                return new jugadorFactory();
            case "edificacion":
                return new edificacionFactory();
            case "centro":
                return new centroMandoFactory();
        }
        return null;
    }
}
