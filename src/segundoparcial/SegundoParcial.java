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
    public static AbstractFactory factory;
    public static void main(String[] args) {
        //AbstractFactory factory;
        factory = FactoryProducer.getFactory("jugador");
        jugador player1 = factory.getJugador(1);
        jugador player2 = factory.getJugador(2);
        player1.welcome();
        player2.welcome();
        while(true){
            player1.play(fase);
            player2.play(fase);
            fase +=1;
        }
    }
    
}
