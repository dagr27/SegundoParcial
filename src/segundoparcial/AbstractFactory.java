/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import jugador.jugador;
import raza.raza;

/**
 *
 * @author Daniel Gómez
 */
public interface AbstractFactory {
    jugador getJugador(int jugador);
    raza getRaza(int raza);
}
