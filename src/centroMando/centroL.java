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
    public void add(atrCentro base) throws Exception{
        if(base != null){
            if (!centro.contains(base)) {
                centro.add(base);               
            }
            Exception e = new Exception("No se permiten Duplicados");
            throw e;
        }else{
            throw new Exception("Ingrese un valor correcto");
        }
    }
    public atrCentro returnCentro(int idUser){
        for(atrCentro base : centro) {
            if(base.idUser == idUser){
                return base;
            }            
        }
        return null;
    }
    public void CobrarRec1(int idUser, int money){
        for(atrCentro base : centro) {
            if(base.idUser == idUser){
                int total = base.getRec1().getRecurso() - money;
                recursos rec1 = new recursos();
                rec1.setRecurso(total);
                rec1.setMax(base.getRec1().getMax());
                base.setRec1(rec1);
            }            
        }
    }
    public void CobrarRec2(int idUser, int money){
        for(atrCentro base : centro) {
            if(base.idUser == idUser){
                int total = base.getRec2().getRecurso() - money;
                recursos rec2 = new recursos();
                rec2.setRecurso(total);
                rec2.setMax(base.getRec3().getMax());
                base.setRec2(rec2);
            }            
        }
    }
    public void CobrarRec3(int idUser, int money){
        for(atrCentro base : centro) {
            if(base.idUser == idUser){
                int total = base.getRec3().getRecurso() - money;
                recursos rec3 = new recursos();
                rec3.setRecurso(total);
                rec3.setMax(base.getRec3().getMax());
                base.setRec3(rec3);
            }            
        }
    }
    
    public void AbonarR1(int idUser, int money){
        for(atrCentro base : centro) {
            if(base.idUser == idUser){
                int total = base.getRec1().getRecurso() + money;
                recursos rec1 = new recursos();
                if(total < base.getRec2().getMax()){
                    rec1.setRecurso(total);
                    rec1.setMax(base.getRec1().getMax());
                    base.setRec1(rec1);
                    System.out.println("Transaccion Exitosa");
                }else{
                    System.out.println("No se pudo abonar porque tiene lleno");
                }
            }            
        }
    }
    public void AbonarR2(int idUser, int money){
        for(atrCentro base : centro) {
            if(base.idUser == idUser){
                int total = base.getRec2().getRecurso() + money;
                recursos rec2 = new recursos();
                if(total < base.getRec2().getMax()){
                    rec2.setRecurso(total);
                    rec2.setMax(base.getRec2().getMax());
                    base.setRec2(rec2);
                    System.out.println("Transaccion Exitosa");
                }else{
                    System.out.println("No se pudo abonar porque tiene lleno");
                }
            }            
        }
    }
    public void AbonarR3(int idUser, int money){
        for(atrCentro base : centro) {
            if(base.idUser == idUser){
                int total = base.getRec3().getRecurso() + money;
                recursos rec3 = new recursos();
                if(total < base.getRec2().getMax()){
                    rec3.setRecurso(total);
                    rec3.setMax(base.getRec3().getMax());
                    base.setRec3(rec3);
                    System.out.println("Transaccion Exitosa");
                }else{
                    System.out.println("No se pudo abonar porque tiene lleno");
                }
            }            
        }
    }
    
}
