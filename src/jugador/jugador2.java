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
public class jugador2 implements jugador {
    jugadorL lista = jugador1.lista;
    @Override
    public void play() {
        
    }

    @Override
    public void welcome() {
        lista.bienvenida(2);
        lista.add(2);
        lista.show(2);
    }
    
}
