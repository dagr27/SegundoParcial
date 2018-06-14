/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raza;

import centroMando.centro;
import edificacion.edificacion;
import jugador.jugador;
import milicia.milicia;
import segundoparcial.AbstractFactory;

/**
 *
 * @author Daniel Gómez
 */
public class razaFactory implements AbstractFactory{

    @Override
    public jugador getJugador(int jugador) {
        return null;
    }

    @Override
    public raza getRaza(int raza) {
        switch(raza){
            case 1:
                return new gunners();
            case 2:
                return new redDevils();
            case 3:
                return new kops();
        }
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
        return null;
    }
    
    
}
