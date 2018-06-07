/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Daniel Gómez
 */
public class jugadorL {
    Scanner leer = new Scanner(System.in);
    private ArrayList<atrJugador> jugador;
    public jugadorL(){
        jugador = new ArrayList<>();
    }
    public void add(){
        atrJugador player = new atrJugador();
        jugador.add(player);
        System.out.println("Ingrese su nickName");
        player.setUser(leer.nextLine());
        System.out.println("Ingrese su nombre");
        player.setNombre(leer.nextLine());
        System.out.println("Seleccione la Raza:");
        player.setRaza(leer.nextLine());
        
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
    public void show(){
        
    }
    public void bienvenida(int player){
        System.out.println("----- Bienvenido Jugador "+ player +" -----");
        System.out.println("Ingrese los datos que acontinuacion se le solicitan:");
    }
    
    
}
