/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centroMando;

/**
 *
 * @author Daniel Gómez
 */
public interface centro {
    centroL listaC = new centroL();
    void construir(int idUser, int fase, int id);
}
