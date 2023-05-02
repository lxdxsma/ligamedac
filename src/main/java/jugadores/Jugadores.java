/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;

import java.util.List;
import persona.Persona;

/**
 * POJOS
 * @author victo
 */
public class Jugadores extends Persona{
    
    private int edad;
 
    private List<Demarcacion> demarcaciones_jugador;

    public Jugadores(String nombre, String apellido, String DNI, double altura, double peso) {
        super(nombre, apellido, DNI, altura, peso);
    }

    public Jugadores(int edad, List<Demarcacion> demarcaciones_jugador, String nombre, String apellido, String DNI, double altura, double peso) {
        super(nombre, apellido, DNI, altura, peso);
        this.edad = edad;
        this.demarcaciones_jugador = demarcaciones_jugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Demarcacion> getDemarcaciones_jugador() {
        return demarcaciones_jugador;
    }

    public void setDemarcaciones_jugador(List<Demarcacion> demarcaciones_jugador) {
        this.demarcaciones_jugador = demarcaciones_jugador;
    }

   
}
   
