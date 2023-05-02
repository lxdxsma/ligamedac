/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesiones;

import java.time.LocalDate;
import java.util.List;
import jugadores.Jugadores;
import medicos.Medicos;

/**
 *
 * @author victo
 */
public class ParteLesionados {

    public static void add(Lesion lesion1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private List<Jugadores> NombreLesionado;
    private String tipoLesion;
    private List<Lesion> gravedadLesion;
    private LocalDate fechaLesion;
    private LocalDate fechaAlta;
    private List<Medicos> medico;

    public ParteLesionados(List<Jugadores> NombreLesionado, String tipoLesion, List<Lesion> gravedadLesion, LocalDate fechaLesion, LocalDate fechaAlta, List<Medicos> medico) {
        this.NombreLesionado = NombreLesionado;
        this.tipoLesion = tipoLesion;
        this.gravedadLesion = gravedadLesion;
        this.fechaLesion = fechaLesion;
        this.fechaAlta = fechaAlta;
        this.medico = medico;
    }

    public List<Jugadores> getNombreLesionado() {
        return NombreLesionado;
    }

    public void setNombreLesionado(List<Jugadores> NombreLesionado) {
        this.NombreLesionado = NombreLesionado;
    }

    public String getTipoLesion() {
        return tipoLesion;
    }

    public void setTipoLesion(String tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    public List<Lesion> getGravedadLesion() {
        return gravedadLesion;
    }

    public void setGravedadLesion(List<Lesion> gravedadLesion) {
        this.gravedadLesion = gravedadLesion;
    }

    public LocalDate getFechaLesion() {
        return fechaLesion;
    }

    public void setFechaLesion(LocalDate fechaLesion) {
        this.fechaLesion = fechaLesion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<Medicos> getMedico() {
        return medico;
    }

    public void setMedico(List<Medicos> medico) {
        this.medico = medico;
    }

    
}
