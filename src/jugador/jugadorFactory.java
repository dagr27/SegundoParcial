/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import edificacion.edificacion;
import milicia.milicia;
import raza.raza;
import segundoparcial.AbstractFactory;

/**
 *
 * @author Daniel Gómez
 */
public class jugadorFactory implements AbstractFactory {
    @Override
    public jugador getJugador(int jugador) {
        switch(jugador){
            case 1:
                return new jugador1();
            case 2:
                return new jugador2();
        }
        return null;
    }

    @Override
    public raza getRaza(int raza) {
        return null;
    }

    @Override
    public milicia getMilicia(int milicia) {
        return null;
    }

    @Override
    public edificacion getEdificacion(int edificacion) {
        return null;
    }
    
}
