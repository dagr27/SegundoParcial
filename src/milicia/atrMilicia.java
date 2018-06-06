/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

/**
 *
 * @author Daniel Gómez
 */
public class atrMilicia {
    String tipo;
    String descripcion;
    int vida;
    int costo;
    
    public atrMilicia(){}
    public atrMilicia(String tipo, String desc, int vida, int costo){
        this.tipo = tipo;
        this.descripcion = desc;
        this.vida = vida;
        this.costo = costo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setDescripcion(String desc){
        this.descripcion = desc;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setCosto(int costo){
        this.costo = costo;
    }
    public String getTipo(){
        return tipo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getVida(){
        return vida;
    }
    public int getCosto(){
        return costo;
    }
}
