/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

import centroMando.centro;
import edificacion.edificacion;
import jugador.jugador;
import raza.raza;
import segundoparcial.AbstractFactory;

/**
 *
 * @author Daniel Gómez
 */
public class miliciaFactory implements AbstractFactory {

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
        switch(milicia){
            case 1:
                return new soldado();
            case 2:
                return new ejercito();
    }
        return null;
    }

    @Override
    public edificacion getEdificacion(int edificacion) {
        return null;
    }

    @Override
    public centro getCentro(int centro) {
        return null;
    }
    
}
