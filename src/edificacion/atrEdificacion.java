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
public class atrEdificacion {
    int id;
    int vida;
    String tipo;
    String player;
    int precio;
    
    public void atrJugador(){}
    public void atrJugador(int id, int vida, String tipo, String player, int precio){
        this.id = id;
        this.vida = vida;
        this.tipo = tipo;
        this.player = player;
        this.precio = precio;       
    }
    public void setId(int id){
        this.id = id;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setPlayer(String player){
        this.player = player;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getId(){
        return this.id;
    }
    public int getVida(){
        return this.vida;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getPlayer(){
        return this.player;
    }
    public int getPrecio(){
        return this.precio;
    }
    
}
