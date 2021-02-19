
package Pregunta2;

public class Tablamovimientos {
    
    private  int idmovimiento;
    private int idproducto;
    private  int cantidad;
    private String titulo;

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    public Tablamovimientos(int idmovimiento, int idproducto, int cantidad) {
        this.idmovimiento = idmovimiento;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
    }

    public Tablamovimientos(String titulo,int idmovimiento, int cantidad) {
        this.idmovimiento = idmovimiento;
        this.cantidad = cantidad;
        this.titulo = titulo;
    }
    
    

    @Override
    public String toString(){
        return "movimiento : " + idmovimiento + " cantidad: " + cantidad + " titulo producto: " + titulo;
    }
    

  
    
    
}
