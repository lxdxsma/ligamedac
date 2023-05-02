/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicos;

import persona.Persona;

/**
 *
 * @author victo
 */
public class Medicos extends Persona{
    private int nColegiado;

    public Medicos(String nombre, String apellido, String DNI, double altura, double peso) {
        super(nombre, apellido, DNI, altura, peso);
    }

    public Medicos(int nColegiado, String nombre, String apellido, String DNI, double altura, double peso) {
        super(nombre, apellido, DNI, altura, peso);
        this.nColegiado = nColegiado;
    }

    public int getnColegiado() {
        return nColegiado;
    }

    public void setnColegiado(int nColegiado) {
        this.nColegiado = nColegiado;
    }
   
   
   
}
