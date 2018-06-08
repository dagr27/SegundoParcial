/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raza;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Gómez
 */
public class razaL {
    Scanner leer = new Scanner(System.in);
    private ArrayList<atrRaza> raza;
    public razaL(){
        raza = new ArrayList<>();
    }
    public void add(int et){
        atrRaza etnia = new atrRaza();
        raza.add(etnia);
        etnia.setId(et);
        if(et == 1){
            etnia.setNombre("Gunners");
            etnia.setDescripcion("Una raza bien maldita");
            etnia.setFortaleza("Fuerza");
        }else if(et == 2){
            etnia.setNombre("RedDevils");
            etnia.setDescripcion("Una raza bien con mucha velocidad");
            etnia.setFortaleza("Velocidad");
        }else if(et == 3){
            etnia.setNombre("Kops");
            etnia.setDescripcion("Una raza bien extraña");
            etnia.setFortaleza("Resistencia");
        }
        
        
        
    }  
}
