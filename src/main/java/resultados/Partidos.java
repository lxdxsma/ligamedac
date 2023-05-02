/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultados;

import arbitros.Arbitros;
import equipos.Equipo;
import java.time.LocalDate;
import java.util.List;
import jugadores.Jugadores;
import lesiones.ParteLesionados;

/**
 *
 * @author victo
 */
public class Partidos {
    private int id_resultado;
    private int n_jornada;
    private List<Arbitros> listaArbitros;
    private String resultado;
    private int golesVisitante;
    private int golesLocal;
    private List<Jugadores> alineacionLocal;
    private List<Jugadores> alineacionVisitante;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private LocalDate fecha_partido;
    private List<ParteLesionados> parteLesionados;

    public Partidos(int id_resultado, int n_jornada, List<Arbitros> listaArbitros, String resultado, int golesVisitante, int golesLocal, List<Jugadores> alineacionLocal, List<Jugadores> alineacionVisitante, Equipo equipoLocal, Equipo equipoVisitante, LocalDate fecha_partido, List<ParteLesionados> parteLesionados) {
        this.id_resultado = id_resultado;
        this.n_jornada = n_jornada;
        this.listaArbitros = listaArbitros;
        this.resultado = resultado;
        this.golesVisitante = golesVisitante;
        this.golesLocal = golesLocal;
        this.alineacionLocal = alineacionLocal;
        this.alineacionVisitante = alineacionVisitante;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha_partido = fecha_partido;
        this.parteLesionados = parteLesionados;
    }

    public int getId_resultado() {
        return id_resultado;
    }

    public void setId_resultado(int id_resultado) {
        this.id_resultado = id_resultado;
    }

    public int getN_jornada() {
        return n_jornada;
    }

    public void setN_jornada(int n_jornada) {
        this.n_jornada = n_jornada;
    }

    public List<Arbitros> getListaArbitros() {
        return listaArbitros;
    }

    public void setListaArbitros(List<Arbitros> listaArbitros) {
        this.listaArbitros = listaArbitros;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public List<Jugadores> getAlineacionLocal() {
        return alineacionLocal;
    }

    public void setAlineacionLocal(List<Jugadores> alineacionLocal) {
        this.alineacionLocal = alineacionLocal;
    }

    public List<Jugadores> getAlineacionVisitante() {
        return alineacionVisitante;
    }

    public void setAlineacionVisitante(List<Jugadores> alineacionVisitante) {
        this.alineacionVisitante = alineacionVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public LocalDate getFecha_partido() {
        return fecha_partido;
    }

    public void setFecha_partido(LocalDate fecha_partido) {
        this.fecha_partido = fecha_partido;
    }

    public List<ParteLesionados> getParteLesionados() {
        return parteLesionados;
    }

    public void setParteLesionados(List<ParteLesionados> parteLesionados) {
        this.parteLesionados = parteLesionados;
    }

   public void ImprimirPartido(){
        System.out.println("El partido se disputo " + fecha_partido);
        System.out.println("El resultado del partido fue " + resultado);
        System.out.println("El equipo visitante anotó " + golesVisitante + " goles");
        System.out.println("El equipo local anotó " + golesLocal + " goles");
        System.out.println("El equipo local fue " + equipoLocal.getNombreEquipo());
        System.out.println("El equipo local fue " + equipoVisitante.getNombreEquipo());
        
        for (Arbitros Arbitros : listaArbitros) {
             Arbitros.imc(Arbitros.getAltura(), Arbitros.getPeso());
             Arbitros.IndiceBroca(Arbitros.getAltura(), Arbitros.getPeso());
             System.out.println("El nombre del arbitro es " + Arbitros.getNombre() +  Arbitros.getnLicencia());
        }
        for (Jugadores alineacionLocal : alineacionLocal) {
            System.out.println("La alineacion local es " + alineacionLocal.getNombre() + alineacionLocal.getApellido());
        }
        for (Jugadores alineacionVisitante : alineacionVisitante) {
            System.out.println("La alineacion visitante es " + alineacionVisitante.getNombre() + alineacionVisitante.getApellido());
        }
        for (ParteLesionados parteLesionados : parteLesionados) {
            System.out.println("La alineacion visitante es " + parteLesionados.getFechaLesion() + parteLesionados.getTipoLesion());
        }
   }
   
   /*public void imprimirArbitro(List<Arbitros> listaArbitros) {
         for (Arbitros arbitros : listaArbitros) {
             System.out.println("El nombre del arbitro es " + Arbitros.getNombre);
   }
        }
   */

         

     
}