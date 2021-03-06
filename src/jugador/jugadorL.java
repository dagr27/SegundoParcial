/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;
import java.util.ArrayList;
import java.util.Scanner;
import segundoparcial.AbstractFactory;
import segundoparcial.FactoryProducer;
import segundoparcial.SegundoParcial;
/**
 *
 * @author Daniel Gómez
 */
public class jugadorL {
    Scanner leer = new Scanner(System.in);
    AbstractFactory factory = SegundoParcial.factory;
    private ArrayList<atrJugador> jugador;
    public jugadorL(){
        jugador = new ArrayList<>();
    }
    public void add(int id){
        atrJugador player = new atrJugador();
        jugador.add(player);
        player.setId(id);
        System.out.println("Ingrese su nickName");
        player.setUser(leer.nextLine());
        System.out.println("Ingrese su nombre");
        player.setNombre(leer.nextLine());
        System.out.println("Seleccione la Raza:");
        System.out.println("1. Gunners");
        System.out.println("2. RedDevils");
        System.out.println("3. Kops");
        int raza = leer.nextInt();
        if(raza == 1){
            factory.getRaza(raza);
            player.setRaza("Gunners");
        }else if(raza == 2){
            factory.getRaza(raza);
            player.setRaza("RedDevils");
        }else if(raza == 2){
            factory.getRaza(raza);
            player.setRaza("RedDevils");
        }
        
    }   
    public void add(atrJugador player) throws Exception{
        if(player != null){
            if (!jugador.contains(player)) {
                jugador.add(player);               
            }
            Exception e = new Exception("No se permiten Duplicados");
            throw e;
        }else{
            throw new Exception("Ingrese un valor correcto");
        }
    }
    public void show(int id){
        for(atrJugador player : jugador) {
            if(player.id == id){
                System.out.println("Nombre: "+player.nombre+", Raza: "+player.Raza);
                break;
            }            
        }
    }
    public atrJugador returnPLayer(int id){
        for(atrJugador player : jugador) {
            if(player.id == id){
                return player;
            }            
        }
        return null;
    }
    public void bienvenida(int player){
        System.out.println("----- Bienvenido Jugador "+ player +" -----");
    }
    
    
}
