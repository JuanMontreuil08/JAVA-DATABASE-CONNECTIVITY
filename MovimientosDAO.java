
package DAO;

import Pregunta2.Conexion;
import Pregunta2.TablaProductos;
import Pregunta2.Tablamovimientos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MovimientosDAO {
    
    
    public static void updateproductos(int id, int cantidad){
        
        try{
            Connection variable = Conexion.conectar();
            
            PreparedStatement varprepa = variable.prepareStatement("Update productos set stock = ? where idproducto = ?");
            
            varprepa.setInt(1, cantidad);
            varprepa.setInt(2, id);
            
            varprepa.execute();
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void insertinto(Tablamovimientos instancia, TablaProductos productos){
        
        try{
            int total;
            Connection variable = Conexion.conectar();
            
            PreparedStatement varprepa = variable.prepareStatement("Insert into movimientos values(?,?,?)");
            
            varprepa.setInt(1, instancia.getIdmovimiento());
            varprepa.setInt(2, instancia.getIdproducto());
            varprepa.setInt(3, instancia.getCantidad());
            
            total = productos.getStock() + instancia.getCantidad();
            updateproductos(instancia.getIdproducto(), total);
            
            varprepa.execute();
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static List<Tablamovimientos>recorrer(){
        List<Tablamovimientos> listar = new ArrayList<Tablamovimientos>();
        
        Tablamovimientos movimientos;
        
        try{
            Connection conexion = Conexion.conectar();
            Statement variablesta = conexion.createStatement();
            
            ResultSet variableresultado = variablesta.executeQuery("Select productos.titulo, movimientos.idmovimiento, movimientos.cantidad from movimientos join productos on movimientos.idproducto = productos.idproducto");
            
            while (variableresultado.next()){
                movimientos = new Tablamovimientos(variableresultado.getString("titulo"),variableresultado.getInt("idmovimiento"),variableresultado.getInt("cantidad"));
                listar.add(movimientos);
            }
            
            listar.stream()
                    .forEach(System.out::println);
            
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return listar;
        
    }
    
    
    
    
    
    
    
    
    
}
