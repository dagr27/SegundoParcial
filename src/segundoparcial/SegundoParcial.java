/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import jugador.jugador;



/**
 *
 * @author Daniel Gómez
 */
public class SegundoParcial {
    static int fase = 0;
    public static void main(String[] args) {
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("jugador");
        jugador player1 = factory.getJugador(1);
        jugador player2 = factory.getJugador(2);
        player1.play();
        player2.play();
    }
    
}
