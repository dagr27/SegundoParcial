/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Gómez
 */
public class edificacionL {
    Scanner leer = new Scanner(System.in);
    private ArrayList<atrEdificacion> edif;
    public edificacionL(){
        edif = new ArrayList<>();
    }
    public void add(String player,String tipo){
        atrEdificacion build = new atrEdificacion();
        build.setId(returnLastId());//Automatico
        build.setPlayer(player);//Parametro
        build.setTipo(tipo);//Parametro
        build.setVida(returnVida());//automatico
        build.setPrecio(returnPrecio());//automatico
        
    }
    public int returnLastId(){
        return 0;
    }
    public int returnVida(){
        return 0;
    }
    public int returnPrecio(){
        return 0;
    }
    
   //Enemigo//
    public void showEnemies(String Player){
        //Mostrar Tropas del otro jugador
    }
    public void delete(){
        
    }
    public void verifyVida(){
        
    } 
}
