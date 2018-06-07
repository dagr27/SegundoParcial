/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author Daniel Gómez
 */
public class jugador1 implements jugador{
    static jugadorL lista = new jugadorL();
    @Override
    public void play() {
        lista.bienvenida(1);
        lista.add();
    }
    
}
