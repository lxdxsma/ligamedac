/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.victor.liga_medac;

import arbitros.Arbitros;
import equipos.Equipo;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jugadores.Demarcacion;
import jugadores.Jugadores;
import lesiones.ParteLesionados;
import lesiones.Lesion;
import medicos.Medicos;
import presidente.Presidente;
import resultados.Partidos;
/**
 *
 * @author victo
 */
public class Liga_medac {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      //  System.out.println("Hello World!");
        
        /*Conexion liga_medac = new Conexion();
        liga_medac.conectar();*/
        
        /*Aqui creo los arbitros*/
        Arbitros ar1 = new Arbitros(1,  1234, "Mateu", "Lahoz", "75395146C", 170, 80);
        Arbitros ar2 = new Arbitros(2,  1544, "Jorge", "Perez", "85246911X", 175, 88);
        Arbitros ar3 = new Arbitros(3,  1292, "Mateu", "Lahoz", "74125896C", 177, 79);
       
        
        /*Aqui meto los arbitros a la lista de arbitros*/
        List<Arbitros> listaArbitros = new ArrayList();
        listaArbitros.add(ar1);
        listaArbitros.add(ar2);
        listaArbitros.add(ar3);
        
        /*Aqui creo la lesion*/
        Lesion lesionado1 = new Lesion("Ligamento cruzado", "Rotura de fibras","Esguince");
        
        /*Aqui introduzco la lesion en una lista*/
        List<Lesion> l1 = new ArrayList();
        l1.add(lesionado1);
        
        /*Aqui creo las fechas de alta y de baja de las lesiones*/
        LocalDate b1 = LocalDate.of(2023, 01, 20);
        LocalDate a2 = LocalDate.of(2023, 02, 2);
        
        /*Aqui creo los medicos que curan al jugador*/
        Medicos m1 = new Medicos(12345, "Manolo", "Ramirez Berenguer", "78404672X", 170, 80);
        Medicos m2 = new Medicos(34567, "Rafael", "Perez Padilla", "76509012V", 175, 85);
        Medicos m3 = new Medicos(14690, "Fede", "Val Lanero", "98754621M", 180, 90);
        
        /*Introduzco los medicos en el equipo medico encargado de la lesion*/
        List<Medicos> equipomedico = new ArrayList();
        equipomedico.add(m1);
        equipomedico.add(m2);
        equipomedico.add(m3);
        
        /*Aqui creo la posicion que ocupa el jugador*/
        Demarcacion d1 = new Demarcacion("Delantero");
        
        /*Aqui meto la posicon en una lista*/
        List<Demarcacion> posicion = new ArrayList();
        posicion.add(d1);
        
        /*Aqui creo el jugador lesionado con un array por si se lesionan mas*/
        Jugadores j1 = new Jugadores(30, posicion, "Cristiano", "Ronaldo", "79845632W", 185, 84);
        
        /*Aqui se mete al jugador en la lista de lesionados*/
        List<Jugadores> jugadoreslesionados = new ArrayList();
        jugadoreslesionados.add(j1);

        /*Aqui creo el parte de lesionados, en el cual se mostraran todos los datos de las lesiones y del jugador*/
        ParteLesionados parte = new ParteLesionados(jugadoreslesionados,"Muscular", l1, b1, a2, equipomedico);
        
        /*Aqui creo la lista de jugadores locales*/
        Jugadores j2 = new Jugadores(33, posicion, "karim", "Benzema", "78945612Q", 175, 80);
        Jugadores j3 = new Jugadores(22, posicion, "Rodrigo", "Goes", "58746912W", 180, 65);
        
        /*Aqui meto los jugadores en la lista de titulares*/
        List<Jugadores> locales = new ArrayList();
        locales.add(j2);
        locales.add(j3);
        
        /*Aqui creo la lista de jugadores visitantes*/
        Jugadores j4 = new Jugadores(33, posicion, "Lionel", "Messi", "12345678P", 170, 64);
        Jugadores j5 = new Jugadores(33, posicion, "Robert", "Lewandowski", "74125896N", 185, 84);
        
        /*Aqui meto los jugadores en la lista de titulares*/
        List<Jugadores> visitantes = new ArrayList();
        visitantes.add(j4);
        visitantes.add(j5);
        
        /*Aqui creo la fecha del partido*/
        LocalDate fp1 = LocalDate.of(2023, 05, 14);
        
        /*Aqui creo la fecha de fundacion*/
        LocalDate fund1 = LocalDate.of(1901, 05, 14);
        LocalDate fund2 = LocalDate.of(1921, 05, 14);
        
        /*Aqui creo la posicion que ocupa el jugador*/
        Presidente presi1 = new Presidente(1, 10, "Florentino", "Perez", "78945612C", 175, 84);
        Presidente presi2 = new Presidente(2, 3, "Bartomeu", "Nobita", "74589632Y", 170, 88);
        
        /*Aqui meto la posicon en una lista*/
        List<Presidente> listapresis = new ArrayList();
        listapresis.add(presi1);
        listapresis.add(presi2);
        
        /*Aqui creo los equipos*/
        Equipo equipo1 = new Equipo("Real Madrid", fund1, listapresis);
        Equipo equipo2 = new Equipo("Barsa", fund2, listapresis);
        
        /*Aqui meto el parte en una lista por si el jugador tiene varios partes medicos*/
        List<ParteLesionados> partes = new ArrayList();
        partes.add(parte);
        
        /*Aqui relleno el constructor de partidos*/
        Partidos partido1 = new Partidos(1, 1, listaArbitros, "4-2", 2, 4, locales, visitantes, equipo1, equipo2, fp1, partes);
        
        /*System.out.println("El partido se disputo " + partido1.getFecha_partido());
        System.out.println("El resultado del partido fue " + partido1.getResultado());
        System.out.println("El equipo visitante anotó " + partido1.getGolesVisitante() + "goles");
        System.out.println("El equipo local anotó " + partido1.getGolesLocal() + "goles");
        System.out.println("Los arbitros del partido fueron" + partido1.getListaArbitros());
        System.out.println("El equipo local que disputo el partido fue el " + partido1.getEquipoLocal() + " y el equipo visitante fue el " + partido1.getEquipoVisitante());
        System.out.println("La alineacion local fue " + partido1.getAlineacionLocal());
        System.out.println("La alineacion visitante fue " + partido1.getAlineacionVisitante());
        System.out.println("A continuacion se mostrara el parte de lesionados "+ parte.getTipoLesion() + parte.getGravedadLesion() + parte.getMedico()+ parte.getFechaLesion() + parte.getFechaAlta());*/
        
       partido1.ImprimirPartido(); 
       /*Arbitros.imprimirArbitro();*/
    }
}
    

