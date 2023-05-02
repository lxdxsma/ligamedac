/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author victo
 */
public class Conexion {
    private static final Logger logConexion = Logger.getLogger("conexion");
    private static Connection conectar;
    private static String host;
    private static String user;
    private static String password;
    
    public static Connection conectar() throws ClassNotFoundException, SQLException{
        host = "localhost:3606/liga_medac";
        user = "root";
        password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://" + host + "?"+ "user=" + user + "&password=" + password );
        if (conectar != null){
            logConexion.info("Se ha establecer la conexion");
        }else {
            logConexion.info("No se ha podido establecer la conexion");
        }
        return null;
       
        
    }
     public static void cerrarConexion() throws SQLException{
            
            if ( conectar.isClosed()){
                logConexion.info("La conexion no esta ");
            }
            else{
                conectar.close();
                logConexion.info("Se ha cerrado la conexion");
            }
        }
}

