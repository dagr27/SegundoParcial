/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centroMando;

import java.util.ArrayList;
import java.util.Scanner;
import segundoparcial.AbstractFactory;
import segundoparcial.SegundoParcial;

/**
 *
 * @author Daniel Gómez
 */
public class centroL {
    Scanner leer = new Scanner(System.in);
    AbstractFactory factory = SegundoParcial.factory;
    private ArrayList<atrCentro> centro;
    public centroL(){
        centro = new ArrayList<>();
    }
    public void add(int id, int idUser){
        atrCentro base = new atrCentro();
        centro.add(base);
        base.setId(id);
        base.setIdUser(idUser);
        base.setNivel(0);
        base.setVida(100);
        recursos rec1 = new recursos();
        recursos rec2 = new recursos();
        recursos rec3 = new recursos();
        
        rec1.setMax(10000);
        rec1.setRecurso(10000);
        base.setRec1(rec1);
        
        rec2.setMax(5000);
        rec2.setRecurso(5000);
        base.setRec2(rec2);
        
        rec3.setMax(3000);
        rec3.setRecurso(3000);
        base.setRec3(rec3);
    }
    
}
