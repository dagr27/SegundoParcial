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
    public void add(int player, String tipo, int vida, int fase){
        atrEdificacion build = new atrEdificacion();
        edif.add(build);
        build.setId(returnLastId());//Automatico
        build.setPlayer(player);//Parametro
        build.setTipo(tipo);//Parametro
        build.setVida(vida);//parametro
        build.setFase(fase);
        build.setEstado(0);
        
    }
    public void add(atrEdificacion edi) throws Exception{
        if(edi != null){
            if (!edif.contains(edi)) {
                edif.add(edi);               
            }
            Exception e = new Exception("No se permiten Duplicados");
            throw e;
        }else{
            throw new Exception("Ingrese un valor correcto");
        }
    }
    public int returnLastId(){
        int last = edif.size()-1;
        return last +1;       
    }
    public void show(int idPlayer){
        int count = 1;
        for(atrEdificacion build : edif) {
            if(build.getPlayer() == idPlayer && build.getEstado() == 1){
                System.out.println(count+". Id Edificio:["+build.getId()+"], Tipo: ["+build.getTipo()+"], Vida:["+build.getVida()+"]");
                count += 1;
            }
        }
    }
    public void actualizarEstado(int idPlayer, int fase){
        for(atrEdificacion build : edif) {
            if(build.getPlayer() == idPlayer && build.getFase() == fase){
                build.setEstado(1);
            }
        }
    }
    public int recolectarRec1(int id){
        int count = 0;
        for(atrEdificacion build : edif) {
            if(build.getPlayer() == id && (build.getTipo()== "Recolector Oro" || build.getTipo()== "Recolector Perlas" || build.getTipo()== "Recolector Metal" ) && build.getEstado()==1){
                count+=10;
            }
        }
        return count;
    }
    public int recolectarRec2(int id){
        int count = 0;
        for(atrEdificacion build : edif) {
            if(build.getPlayer() == id && (build.getTipo()== "Recolector Diamante" || build.getTipo()== "Recolector Gemas" || build.getTipo()== "Recolector Cacao" ) && build.getEstado()==1){
                count+=10;
            }
        }
        return count;
    }
    public int recolectarRec3(int id){
        int count = 0;
        for(atrEdificacion build : edif) {
            if(build.getPlayer() == id && (build.getTipo()== "Recolector Bismuto" || build.getTipo()== "Recolector Plastilina" || build.getTipo()== "Recolector Metal" ) && build.getEstado()==1){
                count+=10;
            }
        }
        return count;
    }
    
   //Enemigo//
    public void showEnemies(int idPlayer){
        int count = 1;
        for(atrEdificacion build : edif) {
            if(build.getPlayer() == idPlayer && build.getEstado() == 1){
                System.out.println(count+". Id Edificio:["+build.getId()+"], Tipo: ["+build.getTipo()+"], Vida:["+build.getVida()+"]");
                count += 1;
            }
        }
    }
    public void delete(){
        
    }
    public void verifyVida(int idUser, int id){
        
    } 
}
