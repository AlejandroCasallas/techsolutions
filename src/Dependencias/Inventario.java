package Dependencias;
import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private String inventarioId;
    private Map<String, Integer> productos;
    private String ubicacion;
    
    public Inventario(String inventarioId, String ubicacion) {
        this.inventarioId = inventarioId;
        this.ubicacion = ubicacion;
        this.productos = new HashMap<>();
    }
    
    public String getInventarioId() { return inventarioId; }
    public void setInventarioId(String inventarioId) { this.inventarioId = inventarioId; }
    public String getId() { return inventarioId; }
    public Map<String, Integer> getProductos() { return productos; }
    public void setProductos(Map<String, Integer> productos) { this.productos = productos; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    
    public void agregarProducto(String productoId, int cantidad) {
        productos.put(productoId, productos.getOrDefault(productoId, 0) + cantidad);
    }
    
    public void removerProducto(String productoId, int cantidad) {
        int actual = productos.getOrDefault(productoId, 0);
        if (actual >= cantidad) {
            productos.put(productoId, actual - cantidad);
        }
    }
    
    @Override
    public String toString() {
        return "Inventario: " + inventarioId + " - " + ubicacion + " (" + productos.size() + " productos)";
    }
}