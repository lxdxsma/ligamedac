/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitros;

import persona.Persona;

/**
 *
 * @author victo
 */
public class Arbitros extends Persona{
    private int id_arbitro;
    private int nLicencia;

    public Arbitros(String nombre, String apellido, String DNI, double altura, double peso) {
        super(nombre, apellido, DNI, altura, peso);
    }

    public Arbitros(int id_arbitro, int nLicencia, String nombre, String apellido, String DNI, double altura, double peso) {
        super(nombre, apellido, DNI, altura, peso);
        this.id_arbitro = id_arbitro;
        this.nLicencia = nLicencia;
    }

    public int getId_arbitro() {
        return id_arbitro;
    }

    public void setId_arbitro(int id_arbitro) {
        this.id_arbitro = id_arbitro;
    }

    public int getnLicencia() {
        return nLicencia;
    }

    public void setnLicencia(int nLicencia) {
        this.nLicencia = nLicencia;
    }

   
    
    

}