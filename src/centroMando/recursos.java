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
public class recursos {
    int recurso;
    int max;
    public recursos(){}
    public recursos(int recurso, int max){
        this.recurso = recurso;
        this.max = max;
    }
    public void setRecurso(int rec){
        this.recurso = rec;
    }
    public void setMax(int max){
        this.max = max;
    }
    public int getRecurso(){
        return this.recurso;
    }
    public int getMax(){
        return this.max;
    }
}
