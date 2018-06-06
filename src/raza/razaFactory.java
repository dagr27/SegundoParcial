/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raza;

import jugador.jugador;
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
    
    
}
