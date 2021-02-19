
package Pregunta2;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    
    private static String rutaBD = "jdbc:mysql://localhost/examen";
    private static String usuario = "root";
    private static String contraseña = "Juanjulio83*";
    private static String driver = "com.mysql.cj.jdbc.Driver";
    
    public static Connection conectar(){
        Connection variable = null;
        
        try{
            Class.forName(driver);
            
            variable = DriverManager.getConnection(rutaBD, usuario, contraseña);
        } catch (Exception e){
            System.out.println(e);
        }
        
        return variable;
        
        
    }
    
}
