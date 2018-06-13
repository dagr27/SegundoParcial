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
    public void add(int player, String tipo){
        atrEdificacion build = new atrEdificacion();
        build.setId(returnLastId());//Automatico
        build.setPlayer(player);//Parametro
        build.setTipo(tipo);//Parametro
        build.setVida(returnVida(tipo));//automatico
        
    }
    public int returnLastId(){
        int last = edif.size()-1;
        return last +1;       
    }
    public int returnVida(String tipo){
        switch(tipo){
            case "Recolector Oro":
                return 100;
            case "Recolector Diamante":
                return 110;
            case "Recoletcor Bismuto":
                return 120;
            case "Recolector Perlas":
                return 100;
            case "Recolector Gemas":
                return 110;
            case "Recoletcor Plastilinas":
                return 120;
            case "Recolector Algodon":
                return 100;
            case "Recolector Cacao":
                return 110;
            case "Recoletcor Metal":
                return 120;
                
        }
        return 0;
    }
    public int returnPrecio(String tipo){
        switch(tipo){
            case "Recolector Oro":
                return 1000;
            case "Recolector Diamante":
                return 1100;
            case "Recoletcor Bismuto":
                return 1200;
            case "Recolector Perlas":
                return 1000;
            case "Recolector Gemas":
                return 1100;
            case "Recoletcor Plastilinas":
                return 1200;
            case "Recolector Algodon":
                return 1000;
            case "Recolector Cacao":
                return 1100;
            case "Recoletcor Metal":
                return 1200;
                
        }
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
