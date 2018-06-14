/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centroMando;

import edificacion.edificacion;
import jugador.jugador;
import milicia.milicia;
import raza.raza;
import segundoparcial.AbstractFactory;

/**
 *
 * @author Daniel Gómez
 */
public class centroMandoFactory implements AbstractFactory {

    @Override
    public jugador getJugador(int jugador) {
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

    @Override
    public centro getCentro(int centro) {
        switch(centro){
            case 1:
                return new base();
        }
        return null;
    }
    
}
