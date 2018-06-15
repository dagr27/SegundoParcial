/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import centroMando.atrCentro;
import centroMando.centro;
import centroMando.centroL;
import centroMando.recursos;
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
    
    centroL listaCentro = centro.listaC;
    Scanner leer = new Scanner(System.in);
    jugadorL lista = jugador1.lista;
    AbstractFactory factory = SegundoParcial.factory;
    public void menu(int id, int fase){ 
       int opc =0;
       atrJugador player = lista.returnPLayer(id);
       while(opc!=7){
            System.out.println("Turno del Jugador: "+player.getUsuario()); 
            printInfoMando(id);
            System.out.println("--- Que acción deseas realizar ---");
            System.out.println("1. Construir Edificaciones");
            System.out.println("2. Entrenar");
            System.out.println("3. Atacar");
            System.out.println("4. Mejorar Centro de Mando");
            System.out.println("5. Revisar todas las edificaciones");
            System.out.println("6. Revisar las Edificaciones del enemigo");
            System.out.println("7. Terminar turno");
            opc= leer.nextInt();
            try{
                 switch(opc){
                     case 1:
                         construir(id, fase);
                         break;
                     case 2:
                         entrenar(id);
                         break;
                     case 6:
                         
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
    public void printInfoMando(int id){
        
        atrCentro base = listaCentro.returnCentro(id);
        int money1= base.getRec1().getRecurso();
        int money2= base.getRec2().getRecurso();
        int money3= base.getRec3().getRecurso();        
        System.out.println("Centro de Mando Nivel:["+base.getNivel()+"]");
        System.out.println("Centro de Mando Vida:["+base.getVida()+"]");
        System.out.println("Recurso 1:["+money1+"]");
        System.out.println("Recurso 2:["+money2+"]");
        System.out.println("Recurso 3:["+money3+"]");
    }
    
    public void construir(int id, int fase){
        String raza;
        atrJugador player = lista.returnPLayer(id);
        raza = player.getRaza();
        atrCentro centro = listaCentro.returnCentro(id);
        recursos rec1 = centro.getRec1();
        recursos rec2 = centro.getRec2();
        recursos rec3 = centro.getRec3();
        System.out.println("--- Que tipo de edificacion deseas construir ---");
        int opc =0;
        if(raza == "Gunners"){            
            System.out.println("1. Recolector de recursos (oro)");
            System.out.println("2. Recolector de recursos (diamantes)");
            System.out.println("3. Recolector de recursos (bismuto)");
            System.out.println("4. Fabrica de Vehiculos");
            System.out.println("5. Fabrica de Tropas");            
            opc = leer.nextInt();
            factory = FactoryProducer.getFactory("edificacion");
            edificacion edif = factory.getEdificacion(opc);
            switch (opc) {
                case 1:
                    edif.construir(id, "Recolector Oro", rec1.getRecurso(), (fase+2));
                    break;
                case 2:
                    edif.construir(id, "Recolector Diamantes", rec1.getRecurso(), (fase+2));
                    break;
                case 3:
                    edif.construir(id, "Recolector Bismuto", rec1.getRecurso(), (fase+2));
                    break;
                case 4:
                    edif.construir(id, "Vehiculos", rec2.getRecurso(), (fase+3));
                    break;
                case 5:
                    edif.construir(id, "Tropas", rec3.getRecurso(), (fase+3));
                    break;
                case 6:
                    
                    break;
                default:
                    break;
            }
                               
       }else if(raza == "RedDevils"){
            System.out.println("1. Recolector de recursos (perlas)");
            System.out.println("2. Recolector de recursos (gemas)");
            System.out.println("3. Recolector de recursos (plastilina)");
            System.out.println("4. Fabrica de Vehiculos");
            System.out.println("5. Fabrica de Tropas");
            opc = leer.nextInt();           
            edificacion edif = factory.getEdificacion(opc);
            switch (opc) {
                case 1:
                    edif.construir(id, "Recolector Perla", rec1.getRecurso(), (fase+2));
                    break;
                case 2:
                    edif.construir(id, "Recolector Gemas", rec1.getRecurso(), (fase+2));
                    break;
                case 3:
                    edif.construir(id, "Recolector Plastilina", rec1.getRecurso(), (fase+2));
                    break;
                case 4:
                    edif.construir(id, "Vehiculos", rec2.getRecurso(), (fase+3));
                    break;
                case 5:
                    edif.construir(id, "Tropas", rec3.getRecurso(), (fase+3));
                    break;
                default:
                    break;
            }
        }else if(raza == "Kops"){
            System.out.println("1. Recolector de recursos (algodon)");
            System.out.println("2. Recolector de recursos (cacao)");
            System.out.println("3. Recolector de recursos (metal)");
            System.out.println("4. Fabrica de Vehiculos");
            System.out.println("5. Fabrica de Tropas");
            opc = leer.nextInt();           
            edificacion edif = factory.getEdificacion(opc);
            switch (opc) {
                case 1:
                    edif.construir(id, "Recolector Algodon", rec1.getRecurso(), (fase+2));
                    break;
                case 2:
                    edif.construir(id, "Recolector Cacao", rec1.getRecurso(), (fase+2));
                    break;
                case 3:
                    edif.construir(id, "Recolector Metal", rec1.getRecurso(), (fase+2));
                    break;
                case 4:
                    edif.construir(id, "Vehiculos", rec2.getRecurso(), (fase+3));
                    break;
                case 5:
                    edif.construir(id, "Tropas", rec3.getRecurso(), (fase+3));
                    break;                
                default:
                    break;
            }
        }
        
    }
    public void mostrarEdificaciones(int id){
        edificacionL lista = edificacion.lista;
        lista.show(id);
    }
    public void mostrarEdificacionesEnemies(int id){
        edificacionL lista = edificacion.lista;
        if(id == 1){
            lista.showEnemies(2);
        }else if(id == 2){
            lista.showEnemies(1);
        }
        
    }
    public void NotificarColecta(int id, int fase){
        factory = FactoryProducer.getFactory("edificacion");
        edificacion rec1 = factory.getEdificacion(1);
        edificacion rec2 = factory.getEdificacion(2);
        edificacion rec3 = factory.getEdificacion(3);
        rec1.recolectar(id, "", fase);
        rec2.recolectar(id, "", fase);
        rec3.recolectar(id, "", fase);
    }
    public void entrenar(int id){
    
    }
    public void atacar(int id ){
        
    }
    
}
