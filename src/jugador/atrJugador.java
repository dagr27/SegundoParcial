/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;
import java.util.Scanner;
/**
 *
 * @author Daniel Gómez
 */
public class atrJugador {
    String usuario;
    String nombre;
    String Raza;
    public atrJugador(){
        
    }
    public atrJugador(String user, String nombre, String raza){
        this.usuario = user;
        this.nombre = nombre;
        this.Raza = raza;
    }
    public void setUser(String user){
        this.usuario = user;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRaza(String raza){
        this.Raza = raza;
    }
    public String getUsuario(){
        return this.usuario;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getRaza(){
        return this.Raza;
    }
}
