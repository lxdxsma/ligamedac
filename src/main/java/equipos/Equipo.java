/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipos;

import java.time.LocalDate;
import java.util.List;
import presidente.Presidente;


/**
 *
 * @author victo
 */
public class Equipo {
    private String nombreEquipo;
    private LocalDate fechaFundacion;
    private List<Presidente> listaPresidente;
    private Presidente presidente;

    public Equipo(String nombreEquipo, LocalDate fechaFundacion, List<Presidente> listaPresidente) {
        this.nombreEquipo = nombreEquipo;
        this.fechaFundacion = fechaFundacion;
        this.listaPresidente = listaPresidente;
    }

    public Equipo(String nombreEquipo, LocalDate fechaFundacion, Presidente nombrePresidente) {
        this.nombreEquipo = nombreEquipo;
        this.fechaFundacion = fechaFundacion;
        this.presidente = presidente;
    }

    public Presidente getpresidente() {
        return presidente;
    }

    public void setpresidente(Presidente presidente) {
        this.presidente = presidente;
    }
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public List<Presidente> getListaPresidente() {
        return listaPresidente;
    }

    public void setListaPresidente(List<Presidente> listaPresidente) {
        this.listaPresidente = listaPresidente;
    }
}