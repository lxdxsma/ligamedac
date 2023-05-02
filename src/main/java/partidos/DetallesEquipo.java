/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;

import equipos.Equipo;

/**
 *
 * @author victo
 */
public class DetallesEquipo {
    private int id_detallesequipo;
    private Equipo Equipo;
    private int goles;
    /*private final ArrayList<convocados>nombre_convocados;
    private final ArrayList<titulares>nombre_titulares;*/
    private String AlineacionNum;

    public DetallesEquipo(int id_detallesequipo, Equipo Equipo, int goles, String AlineacionNum) {
        this.id_detallesequipo = id_detallesequipo;
        this.Equipo = Equipo;
        this.goles = goles;
        this.AlineacionNum = AlineacionNum;
    }

    public int getId_detallesequipo() {
        return id_detallesequipo;
    }

    public void setId_detallesequipo(int id_detallesequipo) {
        this.id_detallesequipo = id_detallesequipo;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getAlineacionNum() {
        return AlineacionNum;
    }

    public void setAlineacionNum(String AlineacionNum) {
        this.AlineacionNum = AlineacionNum;
    }
}
    