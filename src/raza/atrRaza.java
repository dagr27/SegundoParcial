/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raza;

/**
 *
 * @author Daniel Gómez
 */
public class atrRaza {
    int id;
    String nombre;
    String fortaleza;
    String descripcion;
    int idPlayer;
    
    
    public atrRaza(){}
    public atrRaza(int id, String nombre, String fortaleza, String desc, int player){
        this.id = id ;
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.descripcion = desc;
        this.idPlayer = player;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFortaleza(String fortaleza){
        this.fortaleza = fortaleza;
    }
    public void setDescripcion(String desc){
        this.descripcion = desc;
    }
    public void setPlayer(int player){
        this.idPlayer = player;
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getFortaleza(){
        return fortaleza;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getPlayer(){
        return this.idPlayer;
    }
}
