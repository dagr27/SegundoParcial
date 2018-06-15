/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificacion;

import centroMando.centro;
import jugador.jugador;
import milicia.milicia;
import raza.raza;
import segundoparcial.AbstractFactory;

/**
 *
 * @author Daniel Gómez
 */
public class edificacionFactory implements AbstractFactory{

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
        switch(edificacion){
            case 1:
                return new Recurso1();
            case 2:
                return new Recurso2();
            case 3:
                return new Recurso3();
            case 4:
                return new fabricaVehiculo();
            case 5:
                return new fabricaTropas();
        }
        return null;
    }

    @Override
    public centro getCentro(int centro) {
        return null;
    }
    
}
