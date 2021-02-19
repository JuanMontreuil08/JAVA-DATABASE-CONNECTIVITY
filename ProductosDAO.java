
package DAO;

import Pregunta2.Conexion;
import Pregunta2.TablaProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductosDAO {
    
    
    //insert into
    public static void insertinto(TablaProductos instancia){
        try{
            double venta;
            Connection variable = Conexion.conectar();
            
            PreparedStatement varpreparada = variable.prepareStatement("Insert into productos values(?,?,?,?,?)");
            
            varpreparada.setInt(1, instancia.getId());
            varpreparada.setString(2, instancia.getTitulo());
            varpreparada.setInt(3, instancia.getStock());
            varpreparada.setDouble(4, instancia.getPreciocompra());
            
            venta = instancia.getPreciocompra() *1.2;
            varpreparada.setDouble(5, venta);
            
            varpreparada.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
        
        
    }
}
