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
public class base implements centro{
    @Override
    public void construir(int idUser, int fase, int id) {
        listaC.add(id, idUser);
    }
    
}
