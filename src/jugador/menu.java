/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import edificacion.edificacion;
import edificacion.edificacionL;
import java.util.InputMismatchException;
import java.util.Scanner;
import segundoparcial.AbstractFactory;
import segundoparcial.FactoryProducer;
import segundoparcial.SegundoParcial;

/**
 *
 * @author Daniel Gómez
 */
public class menu {
    edificacionL listaEdif = edificacion.lista;
    Scanner leer = new Scanner(System.in);
    jugadorL lista = jugador1.lista;
    AbstractFactory factory = SegundoParcial.factory;
    public void menu(int id, int fase){ 
       int opc =0;
       atrJugador player = lista.returnPLayer(id);
       while(opc!=6){
            System.out.println("Turno del Jugador: "+player.getUsuario());
            System.out.println("--- Que acción deseas realizar ---");
            System.out.println("1. Construir Edificaciones");
            System.out.println("2. Entrenar");
            System.out.println("3. Atacar");
            System.out.println("4. Mejorar Centro de Mando");
            System.out.println("5. Revisar todas las edificaciones");
            System.out.println("6. Terminar turno");
            opc= leer.nextInt();
            try{
                 switch(opc){
                     case 1:
                         construir(id, fase);
                         break;
                     case 2:
                         entrenar(id);
                         break;
                     case 5:
                         mostrarEdificaciones(id);
                }
            }catch (InputMismatchException e){
                System.err.println("Por favor, ingrese una de las opciones.");
                leer.nextLine();
            }
            listaEdif.actualizarEstado(id, fase);
       
    }
       
    }
    public void construir(int id, int fase){
        String raza;
        atrJugador player = lista.returnPLayer(id);
        raza = player.getRaza();
        System.out.println("--- Que tipo de edificacion deseas construir ---");
        System.out.println("1. Fabrica de Ejercitos");
        int opc =0;
        if(raza == "Gunners"){            
            System.out.println("1. Recolector de recursos (oro)");
            System.out.println("2. Recolector de recursos (diamantes)");
            System.out.println("3. Recolector de recursos (bismuto)");
            opc = leer.nextInt();
            factory = FactoryProducer.getFactory("edificacion");
            edificacion edif = factory.getEdificacion(opc);
            if(opc == 1){
                edif.construir(id, "Recolector Oro", 120, (fase+2));
            }else if(opc == 2){
                edif.construir(id, "Recolector Diamantes", 120, (fase+2));
            }else if(opc == 3){
                edif.construir(id, "Recolector Bismuto", 120, (fase+2));
            }
                               
       }else if(raza == "RedDevils"){
            System.out.println("2. Recolector de recursos (perlas)");
            System.out.println("3. Recolector de recursos (gemas)");
            System.out.println("4. Recolector de recursos (plastilina)");
            opc = leer.nextInt();           
            edificacion edif = factory.getEdificacion(opc);
            if(opc == 1){
                edif.construir(id, "Recolector Perla", 120, (fase+2));
            }else if(opc == 2){
                edif.construir(id, "Recolector Gemas", 120, (fase+2));
            }else if(opc == 3){
                edif.construir(id, "Recolector Plastilina", 120, (fase+2));
            }
        }else if(raza == "Kops"){
            System.out.println("2. Recolector de recursos (algodon)");
            System.out.println("3. Recolector de recursos (cacao)");
            System.out.println("4. Recolector de recursos (metal)");
            opc = leer.nextInt();           
            edificacion edif = factory.getEdificacion(opc);
            if(opc == 1){
                edif.construir(id, "Recolector Algodon", 120, (fase+2));
            }else if(opc == 2){
                edif.construir(id, "Recolector Cacao", 120, (fase+2));
            }else if(opc == 3){
                edif.construir(id, "Recolector Metal", 120, (fase+2));
            }
        }
    }
    public void mostrarEdificaciones(int id){
        edificacionL lista = edificacion.lista;
        lista.show(id);
    }
    public void entrenar(int id){
    
    }
    public void atacar(int id ){
        
    }
    
}
