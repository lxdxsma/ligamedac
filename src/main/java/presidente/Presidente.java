/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presidente;

import persona.Persona;

/**
 *
 * @author victo
 */
public class Presidente extends Persona{
   private int idPresidente;
   private int aniosCargo;

    public Presidente(String nombre, String apellido, String DNI, double altura, double peso) {
        super(nombre, apellido, DNI, altura, peso);
    }

    public Presidente(int idPresidente, int aniosCargo, String nombre, String apellido, String DNI, double altura, double peso) {
        super(nombre, apellido, DNI, altura, peso);
        this.idPresidente = idPresidente;
        this.aniosCargo = aniosCargo;
    }

    public int getIdPresidente() {
        return idPresidente;
    }

    public void setIdPresidente(int idPresidente) {
        this.idPresidente = idPresidente;
    }

    public int getAniosCargo() {
        return aniosCargo;
    }

    public void setAniosCargo(int aniosCargo) {
        this.aniosCargo = aniosCargo;
    }

   
   
}
