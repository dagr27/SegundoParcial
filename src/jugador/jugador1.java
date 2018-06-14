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
    public void play(int fase) {
        menu.menu(1,fase);
    }

    @Override
    public void welcome() {
        lista.bienvenida(1);
        lista.add(1);
        lista.show(1);
    }
    
}
