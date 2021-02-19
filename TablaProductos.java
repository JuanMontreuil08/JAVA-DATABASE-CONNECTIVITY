
package Pregunta2;

public class TablaProductos {
    
    private int id;
    private String titulo;
    private int stock;
    private double preciocompra;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    

    public TablaProductos(int id, String titulo, int stock, double preciocompra) {
        this.id = id;
        this.titulo = titulo;
        this.stock = stock;
        this.preciocompra = preciocompra;
        
    }
    
    @Override
    public String toString(){
        return "Producto : " + titulo + " su stock: " + stock + " precio compra :" + preciocompra;
    }
}
