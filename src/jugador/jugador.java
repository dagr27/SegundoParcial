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
public interface jugador {
    menu menu = new menu();
    void welcome();
    void play(int fase);
}
