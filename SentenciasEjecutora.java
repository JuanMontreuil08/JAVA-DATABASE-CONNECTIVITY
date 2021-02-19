
package Pregunta2;

import DAO.MovimientosDAO;
import DAO.ProductosDAO;

public class SentenciasEjecutora {
    
    public static void main(String[] args) {
        
        
      
        
        TablaProductos p1 = new TablaProductos(1,"Manzana",0, 3);
        
        //ProductosDAO.insertinto(p1);
        
        Tablamovimientos m1 = new Tablamovimientos(11,1,100);
        //MovimientosDAO.insertinto(m1, p1);
        
        
        MovimientosDAO.recorrer();
        
    }
}
