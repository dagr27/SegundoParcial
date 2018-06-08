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
public class SegundoParcial {
    static int fase = 0;
   
    public static void main(String[] args) {
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("raza");
        //Creacion de razas
        /*raza gunner = factory.getRaza(1);
        gunner.create();
        raza red = factory.getRaza(2);
        red.create();
        raza kops = factory.getRaza(3);
        kops.create();*/
        //Creacion de jugadores
        factory = FactoryProducer.getFactory("jugador");
        jugador player1 = factory.getJugador(1);
        jugador player2 = factory.getJugador(2);
        player1.welcome();
        player2.welcome();
    }
    
}
