/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificacion;

/**
 *
 * @author Daniel Gómez
 */
public interface edificacion {
    atrEdificacion edif = new atrEdificacion();
    edificacionL lista = new edificacionL();
    void construir(int id, String tipo, int money, int fase);
}
