/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author Daniel Gómez
 */
public class menu {
    jugadorL lista = jugador1.lista;
    
    public void menu(int id, int fase){ 
       int opc =0; 
       atrJugador player = lista.returnPLayer(id);
       System.out.println("--- Que acción deseas realizar ---");
       System.out.println("1. Construir Edificaciones");
       System.out.println("2. Entrenar");
       System.out.println("3. Atacar");
       System.out.println("4. Mejorar Centro de Mando");
       switch(opc){
           case 1:
               construir(id);
               break;
       }
       
    }
    public void construir(int id){
        String raza;
        atrJugador player = lista.returnPLayer(id);
        raza = player.getRaza();
        System.out.println("--- Que tipo de edificacion deseas construir ---");
        System.out.println("1. Fabrica de Ejercitos");
        if(raza == "Gunners"){
            System.out.println("2. Recolector de recursos (oro)");
            System.out.println("3. Recolector de recursos (diamantes)");
            System.out.println("4. Recolector de recursos (bismuto)");
        }else if(raza == "RedDevils"){
            System.out.println("2. Recolector de recursos (perlas)");
            System.out.println("3. Recolector de recursos (gemas)");
            System.out.println("4. Recolector de recursos (plastilina)");
        }else if(raza == "Kops"){
            System.out.println("2. Recolector de recursos (algodon)");
            System.out.println("3. Recolector de recursos (cacao)");
            System.out.println("4. Recolector de recursos (metal)");
        }
    }
    public void entrenar(int id){
    
    }
    public void atacar(int id ){
        
    }
    
}
