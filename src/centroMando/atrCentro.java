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
public class atrCentro {
    int id;
    int idUser;
    int nivel;
    int vida;
    recursos recurso1;
    recursos recurso2;
    recursos recurso3;
    
    public atrCentro(){}
    public atrCentro(int id, int idUser, int nivel,int vida, recursos recurso1, recursos recurso2, recursos recurso3){
        this.id = id;
        this.idUser = idUser;
        this.nivel = nivel;
        this.vida = vida;
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        this.recurso3 = recurso3;
        
    }
    public void setId(int id){
        this.id = id;
    }
    public void setIdUser(int iduser){
        this.id = iduser;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setRec1(recursos rec1){
        this.recurso1 = rec1;
    }
    public void setRec2(recursos rec2){
        this.recurso2 = rec2;
    }
    public void setRec3(recursos rec3){
        this.recurso3 = rec3;
    }
    
    public int getId(){
        return this.id;
    }
    public int getIdUser(){
        return this.idUser;
    }
    public int getNivel(){
        return this.nivel;
    }
    public int getVida(){
        return this.vida;
    }
    public recursos getRec1(){
        return this.recurso1;
    }
    public recursos getRec2(){
        return this.recurso2;
    }
    public recursos getRec3(){
        return this.recurso3;
    }
    
}
