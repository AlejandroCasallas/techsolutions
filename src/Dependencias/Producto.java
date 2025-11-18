package Dependencias;
public class Producto {
    private String productoId;
    private String nombre;
    private double precio;
    private String categoria;
    
    public Producto(String productoId, String nombre, double precio, String categoria) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    public String getProductoId() { return productoId; }
    public void setProductoId(String productoId) { this.productoId = productoId; }
    public String getId() { return productoId; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    @Override
    public String toString() {
        return "Producto: " + nombre + " - $" + precio + " (" + categoria + ")";
    }
}